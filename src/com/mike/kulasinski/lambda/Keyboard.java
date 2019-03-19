package com.mike.kulasinski.lambda;

class Keyboard {

    private Listener listener;

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public void click(char c) {
        System.out.println("Nacisnieto: " + c);
        if (listener != null) {
            listener.onClick(c);
        }
    }

    interface Listener {
        void onClick(char c);
    }
}
