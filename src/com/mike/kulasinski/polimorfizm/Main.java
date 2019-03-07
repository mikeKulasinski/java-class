package com.mike.kulasinski.polimorfizm;

public class Main {
    public static void main(String[] args) {
        Sender whatsApp = new WhatsApp();
        Sender poczta = new PocztaPolska();
        Sender sms = new SMS();

        sendMessage("Polimorfizm jest super", whatsApp);
        sendMessage("Polimorfizm jest super", poczta);
        sendMessage("Polimorfizm jest super", sms);
    }

    private static void sendMessage(String message, Sender sender) {
        System.out.println("Wysylam wiadomosc");
        sender.sendMessage(message);
        System.out.println("Wiadomosc zostala wyslana");
        System.out.println();
    }
}

interface Sender {
    void sendMessage(String message);
}

class WhatsApp implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("WhatsApp: " + message);
    }
}

class PocztaPolska implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("PocztaPolska: " + message);
    }
}

class SMS implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}