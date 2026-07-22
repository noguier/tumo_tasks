import java.util.ArrayList;
import java.util.List;

/**
 * A shopping basket with an optional spending limit.
 *
 * Guarantees:
 *   - the total always equals the sum of the items in it
 *   - the total never exceeds the limit
 *   - no item has a negative price or a blank name
 *   - the limit is fixed at construction and can never be raised to sneak something in
 */
public class EncapsulatedBasket {

    /** One line item. A record is immutable: once created, nobody can edit it. */
    public record Item(String name, int price) {
        public Item {
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("An item needs a name");
            }
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative: " + price);
            }
        }
    }

    private final List<Item> items = new ArrayList<>();
    private final int limit;

    /** A basket with no spending limit. */
    public EncapsulatedBasket() {
        this(Integer.MAX_VALUE);
    }

    /** A basket that refuses to go above {@code limit}. */
    public EncapsulatedBasket(int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("Limit cannot be negative: " + limit);
        }
        this.limit = limit;
    }

    /**
     * Adds an item if it fits under the limit.
     *
     * @return true if it was added, false if it would exceed the limit
     * @throws IllegalArgumentException if the name is blank or the price is negative
     */
    public boolean add(String name, int price) {
        Item item = new Item(name, price);          // validates before anything changes
        if (getTotalPrice() + price > limit) {
            return false;
        }
        items.add(item);
        return true;
    }

    /** Derived from the items, so it can never disagree with them. */
    public int getTotalPrice() {
        int total = 0;
        for (Item item : items) {
            total += item.price();
        }
        return total;
    }

    public int getItemCount() {
        return items.size();
    }

    public boolean hasLimit() {
        return limit != Integer.MAX_VALUE;
    }

    /** A read-only copy — callers can't add or remove items behind the basket's back. */
    public List<Item> getItems() {
        return List.copyOf(items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("List of items:");
        for (Item item : items) {
            sb.append("\n").append(item.name()).append(" -- ").append(item.price());
        }
        return sb.append("\nTotal: ").append(getTotalPrice()).toString();
    }
}