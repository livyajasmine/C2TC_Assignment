package com.livyajasmine.assignement3;

public class Library {
    private Item[] items;
    private int count; // to track how many items added

    public Library() {
        items = new Item[10]; // initial capacity
        count = 0;
    }

    public void addItem(Item item) {
        if (count == items.length) {
            // Resize array (double the size)
            Item[] newItems = new Item[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count] = item;
        count++;
    }

    public void showAllItems() {
        System.out.println("Library contains:");
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            if (item instanceof Book) {
                System.out.println("- " + ((Book) item).getDetails());
            } else if (item instanceof Magazine) {
                System.out.println("- " + ((Magazine) item).getDetails());
            }
        }
    }
}