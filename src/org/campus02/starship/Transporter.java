package org.campus02.starship;

public class Transporter {

    public void beam(String person, String from, String to, boolean urgent)
            throws TransporterMalFunctionException {

        if (urgent && Math.random() < 0.5) {
            // Es ist dringend und zu 50% kann etwas schief gehen
            throw new TransporterMalFunctionException(person + " sollte von "
                    + from + " nach " + to + " gebeamt werden. Es war DRINGEND!"); // verlässt die Methode an dieser Stelle
        }

        System.out.println(person + " wird von " + from + " nach " + to + " gebeamt");
    }

    public void shutdown() {
        System.out.println("Transporter wird sicher heruntergefahren.");
    }
}
