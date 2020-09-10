package com.thzc.Iterator.version1;

import java.util.Iterator;
import java.util.function.Consumer;

public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("删除操作非法");
        }
        if (items[position - 1] != null) {
            for (int i= position-1; i <(items.length-1); i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }

    @Override
    public void forEachRemaining(Consumer action) {

    }

    @Override
    public boolean hasNext() {
        return items.length > position;
    }
}
