package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

class Sports {

    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }

    public static int numberOfPlayers = 11;

    void getNumberOfTeamMembers() {
        System.out.println(String.format("Each team has %d players in ", numberOfPlayers) + getName());
    }

}

public class MethodOverriding {
    public static void main(String[] args) {
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}
