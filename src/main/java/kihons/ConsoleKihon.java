package kihons;

import framework.bases.ConsoleKihonBase;
import framework.exceptions.NotImplementedYetException;

import java.util.Scanner;

public class ConsoleKihon extends ConsoleKihonBase {
    @Override
    protected void writeFooBarToTheConsole() {
        System.out.print("FooBar");
    }

    @Override
    protected void writeLineFooBarToTheConsole() {
        System.out.println("FooBar");
    }

    @Override
    protected String readLineFromConsoleAndReturnValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        return name;

    }
}
