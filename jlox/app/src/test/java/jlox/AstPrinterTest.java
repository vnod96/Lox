package jlox;


import org.junit.jupiter.api.Test;

public class AstPrinterTest {
    @Test
    public void testPrint() {
        AstPrinter printer = new AstPrinter();

        Expr.Binary expr = new Expr.Binary(
                new Expr.Unary(
                        new Token(TokenType.MINUS, "-", null, 1),
                        new Expr.Literal(123)
                ),
                new Token(TokenType.STAR, "*", null, 1),
                new Expr.Grouping(new Expr.Literal(22))
        );
        System.out.println(printer.print(expr));
    }
}
