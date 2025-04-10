package design_patterns.behavioral.chainOfResponsibility;

import java.util.Scanner;

public class BasicSupport extends CustomerServiceAgent{

    @Override
    public void handle(Request request) {
        System.out.println("Basic support: Have you tried turning it off and on again?");
        try (Scanner Scanner = new Scanner (System.in)) {
            String answer = Scanner.next();

            if (answer.equals("no")){
                System.out.println("Try it. Bye bye");
                return; // request finishes here
            }
        }
        System.out.println("Basic operator will forward your request to an available Tech support ");
        this.getNext().handle(request);
    }
}
