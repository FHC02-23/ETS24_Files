package org.campus02.starship;

public class Starship {
    private String name;
    private Transporter transporter; // = new Transporter();;

    public Starship(String name) {
        this.name = name;
        transporter = new Transporter();
    }

    public void beam(String person, String from)  {

        try {
            transporter.beam(person, from, name, true);
        } catch (TransporterMalFunctionException e) {
            e.printStackTrace();
        }
        finally {
            transporter.shutdown();
        }
    }
}
