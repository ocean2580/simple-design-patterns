package ocean.behavior.visitor;

public class Main {
    public static void main(String[] args) {
        Prize prize = new Prize("NECCS","First Prize ");

        new Classmate().visit(prize);
        new Teacher().visit(prize);
        new Boss().visit(prize);
        new Family().visit(prize);

    }
}
