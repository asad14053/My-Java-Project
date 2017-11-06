
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    char o;
    int ctr = 0;
    String value = "", cv = "", oBtn;
    Double answer, v1, v2, v3;
    Double NumberConverted;
    long a;
    Frame f;
    Panel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18;
    private TextField tField;
    private Menu EditMenu;
    private MenuBar menuBar;
    private MenuItem fmi1, fmi2, fmi3;
    private Button num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;

    private Button bAdd, bSub, bMul, bDiv, bPer, bSqrt, bFrac, bInt, bDot,
            bCE, equals, backspace, clear, bsin, basin, bcos, bacos, bpi, bsqr, bxn, btan, batan, bfac, bdeg, brad, blog, bln, bln1, bbin, boct, bhex,
            bqube, bsqube, babs, bexp;

    Calculator() {
        f = new Frame("SCIENTIFIC CALCULATOR");
        menuBar = new MenuBar();
        EditMenu = new Menu("Edit");

        fmi1 = new MenuItem(" Copy  ");
        fmi2 = new MenuItem(" Paste ");
        fmi3 = new MenuItem(" Quit    ");

        EditMenu.add(fmi1);
        EditMenu.add(fmi2);
        EditMenu.addSeparator();
        EditMenu.add(fmi3);

        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();
        p5 = new Panel();
        p6 = new Panel();
        p7 = new Panel();
        p8 = new Panel();
        p9 = new Panel();
        p10 = new Panel();
        p11 = new Panel();
        p12 = new Panel();
        p13 = new Panel();
        p14 = new Panel();
        p15 = new Panel();
        p16 = new Panel();
        p17 = new Panel();

        tField = new TextField(75);

        num0 = new Button("0");
        num1 = new Button("1");
        num2 = new Button("2");
        num3 = new Button("3");
        num4 = new Button("4");
        num5 = new Button("5");
        num6 = new Button("6");
        num7 = new Button("7");
        num8 = new Button("8");
        num9 = new Button("9");
        bAdd = new Button("+");
        bSub = new Button("-");
        bMul = new Button("x");
        bDiv = new Button("/");
        bPer = new Button("%");
        bSqrt = new Button("sqrt");
        bFrac = new Button("1/x");
        bInt = new Button("+/-");
        bDot = new Button(".");
        bCE = new Button("CE");
        equals = new Button("=");
        backspace = new Button("Backspace");
        clear = new Button("C");

        bsin = new Button("Sin");
        bcos = new Button("Cos");
        basin = new Button("aSin");
        bacos = new Button("aCos");
        bpi = new Button("Pi");
        bsqr = new Button("Sqr");
        bxn = new Button("X^n");
        btan = new Button("Tan");
        batan = new Button("aTan");
        bfac = new Button(" N! ");
        bdeg = new Button("Deg");
        brad = new Button("Rad");
        blog = new Button("Log10");
        bln = new Button("Ln");
        bln1 = new Button("Ln1");

        bbin = new Button("Bin");
        boct = new Button("Oct");
        bhex = new Button("Hex");
        bqube = new Button("X^3");
        bsqube = new Button("X^(1/3)");
        babs = new Button("Abs");
        bexp = new Button("EXP");

    }

    public void launchFrame() {

        tField.setText(" ");
        tField.setEnabled(true);

        menuBar.add(EditMenu);

        p2.add(backspace);
        p2.add(bCE);
        p2.add(clear);

        p3.add(num7);
        p3.add(num8);
        p3.add(num9);
        p3.add(bDiv);

        p4.add(num4);
        p4.add(num5);
        p4.add(num6);
        p4.add(bMul);

        p5.add(num1);
        p5.add(num2);
        p5.add(num3);
        p5.add(bSub);

        p6.add(num0);
        p6.add(bInt);
        p6.add(bDot);
        p6.add(bAdd);

        /*    complete       */ p7.add(bsqr);
        /*    complete       */ p7.add(bSqrt);
        /*    complete       */ p7.add(bPer);
        /*    complete       */ p7.add(bFrac);
        /*    complete       */ p7.add(equals);

        /*    complete       */ p8.add(bsin);
        /*    complete       */ p8.add(basin);
        /*    complete       */ p8.add(bcos);
        /*    complete       */ p8.add(bacos);

        /*    complete       */ p9.add(btan);
        /*    complete       */ p9.add(batan);
        /*    complete       */ p9.add(bpi);
        /*    complete       */p9.add(bfac);

        /*    complete       */p10.add(bxn);
        /*    complete       */ p10.add(bdeg);
        /*    complete       */ p10.add(brad);

        /*    complete       */p11.add(bbin);
        /*    complete       */p11.add(boct);
       /*    complete       */ p11.add(bhex);

        /*    complete       */ p11.add(bqube);

        /*    complete       */ p12.add(blog);
        /*    complete       */ p12.add(bln);
        /*    complete       */ p12.add(bln1);
        /*    complete       */ p12.add(bsqube);
        /*    complete       */ p13.add(babs);
        /*    complete       */ p13.add(bexp);
        p2.setLayout(new GridLayout(1, 3, 2, 2));
        p3.setLayout(new GridLayout(1, 3, 2, 2));
        p4.setLayout(new GridLayout(1, 3, 2, 2));
        p5.setLayout(new GridLayout(1, 3, 2, 2));
        p6.setLayout(new GridLayout(1, 3, 2, 2));

        p7.setLayout(new GridLayout(1, 3, 2, 2));
        p8.setLayout(new GridLayout(1, 3, 2, 2));
        p9.setLayout(new GridLayout(1, 3, 2, 2));
        p10.setLayout(new GridLayout(1, 3, 2, 2));
        p11.setLayout(new GridLayout(1, 3, 2, 2));
        p12.setLayout(new GridLayout(1, 3, 2, 2));
        p13.setLayout(new GridLayout(1, 3, 2, 2));

        f.setLayout(new GridLayout(16, 4));
        f.setResizable(false);
        f.setSize(400, 400);
        f.add(tField);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(p5);
        f.add(p6);
        f.add(p7);
        f.add(p8);
        f.add(p9);
        f.add(p10);
        f.add(p11);
        f.add(p12);
        f.add(p13);
        f.setVisible(true);
        f.setMenuBar(menuBar);
        f.pack();

        // ACTION LISTENERS
        clear.addActionListener(this);
        bCE.addActionListener(this);

        num0.addActionListener(this);
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);

        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
        bPer.addActionListener(this);

        bInt.addActionListener(this);
        bSqrt.addActionListener(this);
        bFrac.addActionListener(this);
        bDot.addActionListener(this);

        equals.addActionListener(this);
        backspace.addActionListener(this);

        fmi1.addActionListener(this);
        fmi2.addActionListener(this);
        fmi3.addActionListener(this);

        bsin.addActionListener(this);
        basin.addActionListener(this);
        bcos.addActionListener(this);
        bacos.addActionListener(this);
        bpi.addActionListener(this);
        bsqr.addActionListener(this);
        btan.addActionListener(this);
        batan.addActionListener(this);
        bxn.addActionListener(this);
        bfac.addActionListener(this);
        bdeg.addActionListener(this);
        brad.addActionListener(this);
        blog.addActionListener(this);
        bln.addActionListener(this);
        bln1.addActionListener(this);

        bbin.addActionListener(this);
        boct.addActionListener(this);
        bhex.addActionListener(this);
        bqube.addActionListener(this);
        bsqube.addActionListener(this);
        babs.addActionListener(this);
        bexp.addActionListener(this);

    }

    public void actionPerformed(ActionEvent a) {

        try {
            /* |-------- Handling Exceptions ---------| */

            if (a.getSource() == num0) {
                value += 0;
                tField.setText(value);
            }
            if (a.getSource() == num1) {
                value += 1;
                tField.setText(value);
            }
            if (a.getSource() == num2) {
                value += 2;
                tField.setText(value);
            }
            if (a.getSource() == num3) {
                value += 3;
                tField.setText(value);
            }
            if (a.getSource() == num4) {
                value += 4;
                tField.setText(value);
            }
            if (a.getSource() == num5) {
                value += 5;
                tField.setText(value);
            }
            if (a.getSource() == num6) {
                value += 6;
                tField.setText(value);
            }
            if (a.getSource() == num7) {
                value += 7;
                tField.setText(value);
            }
            if (a.getSource() == num8) {
                value += 8;
                tField.setText(value);
            }
            if (a.getSource() == num9) {
                value += 9;
                tField.setText(value);
            }

            if (a.getSource() == bAdd) {
                v1 = Double.parseDouble(tField.getText());
                ctr = 0;
                o = '+';
                value = "";
                tField.setText("" + value);
            }

            if (a.getSource() == bSub) {
                v1 = Double.parseDouble(tField.getText());
                ctr = 0;
                o = '-';
                value = "";
                tField.setText("" + value);
            }

            if (a.getSource() == bMul) {
                v1 = Double.parseDouble(tField.getText());
                ctr = 0;
                o = 'x';
                value = "";
                tField.setText("" + value);
            }

            if (a.getSource() == bDiv) {
                v1 = Double.parseDouble(tField.getText());
                ctr = 0;
                o = '/';
                value = "";
                tField.setText("" + value);
            }

            if (a.getSource() == bPer) {
                v1 = Double.parseDouble(tField.getText());
                ctr = 0;
                value = "";
                answer = (v1 / 100);
                tField.setText("" + answer);
            }
            if (a.getSource() == bxn) {

                //a = 0; 
               
                v1 = Double.parseDouble(tField.getText());
                 tField.setText("");
                o = '^';
               
                //  v3= Double.parseDouble(tField.getText());
                value = "";
            }
            if (a.getSource() == bfac) {

                //a = 0; 
                tField.setText("");
                value = "";
               o='!';
               
                
                value = "";
            }
            if (a.getSource() == bbin) {

                //a = 0; 
                tField.setText("");
                value = "";
               o='b';   
            }
            if (a.getSource() == bhex) {

                //a = 0; 
                tField.setText("");
                value = "";
               o='h';   
            }
            if (a.getSource() == boct) {

                //a = 0; 
                tField.setText("");
                value = "";
               o='o';   
            }

            if (a.getSource() == equals) {
                value = "";
                v2 = Double.parseDouble(tField.getText());

                if (o == '+') {
                    ctr = 0;
                    answer = v1 + v2;
                    tField.setText("" + answer);
                    value = "";
                    v1 = null;
                    v2 = null;
                } else if (o == '-') {
                    ctr = 0;
                    answer = v1 - v2;
                    tField.setText("" + answer);
                    value = "";
                    v1 = null;
                    v2 = null;
                } else if (o == 'x') {
                    ctr = 0;
                    answer = v1 * v2;
                    tField.setText("" + answer);
                    value = "";
                    v1 = null;
                    v2 = null;
                } else if (o == '/') {
                    ctr = 0;
                    answer = v1 / v2;
                    tField.setText("" + answer);
                    value = "";
                    v1 = null;
                    v2 = null;
                } else if (o == '%') {
                    ctr = 0;
                    answer = v1 % v2;
                    tField.setText("" + answer);
                    value = "";
                    v1 = null;
                    v2 = null;
                } else if (o == '^') {
                    ctr = 0;
                    answer = 1.0;
                    for (double i = 1; i <= v2; i++) {
                        answer *= v1;
                    }
                    tField.setText("" + answer);
                    value = "";
                    v1 = null;
                    v2 = null;
                }
                else if(o=='!')
                {
                     v1 = Double.parseDouble(tField.getText());
                     answer=1.0;
                for(int i=1;i<=v1;i++)
                {
                    answer*=i;
                }
                 tField.setText(""+answer);
                }
                else if(o=='b')
                {
                    int m;
                    m = Integer.parseInt(tField.getText());
                     String q=Integer.toBinaryString(m);
                      tField.setText(""+q);
                }
                 else if(o=='h')
                {
                    int m;
                    m = Integer.parseInt(tField.getText());
                     String q=Integer.toHexString(m);
                      tField.setText(""+q);
                }
                 else if(o=='o')
                {
                    int m;
                    m = Integer.parseInt(tField.getText());
                     String q=Integer.toOctalString(m);
                      tField.setText(""+q);
                }
            }

            /* |-- EQUALS ACTION --| */
 /*	25Oct2005:	Designed and programmed by jfernandez.ph	 */
 /*	13Nov2005:	Designed and programmed by jfernandez.ph 	*/
 /*	|-- Clear --| */
            if (a.getSource() == clear) {
                ctr = 0;
                v1 = null;
                v2 = null;
                value = "";
                answer = 0.;
                tField.setText("0.0");

            }

            if (a.getSource() == bCE) {
                ctr = 0;
                value = "";
                tField.setText("0.0");
            }


            /*	|-- Point --| */
            if (a.getSource() == bDot) {
                if (ctr == 0) {
                    value += ".";
                    ctr += 1;
                    tField.setText("" + value);
                } else {
                    System.out.print("");
                }

            }

            /* |-- Back Space --| */
            if (a.getSource() == backspace) {
                value = value.substring(0, value.length() - 1);
                tField.setText("" + value);
            }

            /* |-- Square Root --| */
            if (a.getSource() == bSqrt) {
                ctr = 0;
                value = "";
                v1 = Math.sqrt(Double.parseDouble(tField.getText()));
                tField.setText("" + v1);
            }

            if (a.getSource() == bpi) {
                ctr = 0;
                value = "";
                v1 = Math.PI;
                tField.setText("" + v1);
            }
            if (a.getSource() == bsin) {
                ctr = 0;
                value = "";
                v1 = Math.sin(Double.parseDouble(tField.getText()));
                tField.setText("" + v1);
            }
            if (a.getSource() == basin) {
                ctr = 0;
                value = "";
                v1 = Math.asin(Double.parseDouble(tField.getText()));
                tField.setText("" + v1);
            }
            if (a.getSource() == bcos) {
                ctr = 0;
                value = "";
                v1 = Math.cos(Double.parseDouble(tField.getText()));
                tField.setText("" + v1);
            }
            if (a.getSource() == bacos) {
                ctr = 0;
                value = "";
                v1 = Math.acos(Double.parseDouble(tField.getText()));
                tField.setText("" + v1);
            }
            if (a.getSource() == btan) {
                ctr = 0;
                value = "";
                v1 = Math.tan(Double.parseDouble(tField.getText()));
                tField.setText("" + v1);
            }
            if (a.getSource() == batan) {
                ctr = 0;
                value = "";
                v1 = Math.atan(Double.parseDouble(tField.getText()));
                tField.setText("" + v1);
            }
            if (a.getSource() == bln) {
                ctr = 0;
                value = "";
                v1 = Math.log(Double.parseDouble(tField.getText()));
                tField.setText("" + v1);
            }
            if (a.getSource() == blog) {
                ctr = 0;
                value = "";
                v1 = Math.log10(Double.parseDouble(tField.getText()));
                tField.setText("" + v1);
            }
            if (a.getSource() == bln1) {
                ctr = 0;
                value = "";
                v1 = Math.log1p(Double.parseDouble(tField.getText()));
                tField.setText("" + v1);
            }
            if (a.getSource() == babs) {
                ctr = 0;
                value = "";
                v1 = Math.abs(Double.parseDouble(tField.getText()));
                tField.setText("" + v1);
            }
            if (a.getSource() == brad) {
                ctr = 0;
                value = "";
                v1 = Math.toRadians(Double.parseDouble(tField.getText()));
                tField.setText("" + v1);
            }
            if (a.getSource() == bdeg) {
                ctr = 0;
                value = "";
                v1 = Math.toDegrees(Double.parseDouble(tField.getText()));
                tField.setText("" + v1);
            }
            if (a.getSource() == bexp) {
                ctr = 0;
                value = "";
                v1 = Math.exp(Double.parseDouble(tField.getText()));
                tField.setText("" + v1);
            }
            if (a.getSource() == bsqube) {
                ctr = 0;
                value = "";
                v1 = Math.cbrt(Double.parseDouble(tField.getText()));
                tField.setText("" + v1);
            }
            if (a.getSource() == bqube) {
                ctr = 0;
                value = "";
                v1 = Math.pow(Double.parseDouble(tField.getText()), 3);
                tField.setText("" + v1);
            }
            if (a.getSource() == bsqr) {
                ctr = 0;
                value = "";
                v1 = Math.pow(Double.parseDouble(tField.getText()), 2);
                tField.setText("" + v1);
            }

            /* |-- Integer --| */
            if (a.getSource() == bInt) {
                ctr = 0;
                NumberConverted = (Double.parseDouble(tField.getText()) * -1);
                value = "";
                tField.setText("" + NumberConverted);
            }

            /* |-- Reciprocal --| */
            if (a.getSource() == bFrac) {
                ctr = 0;
                value = "";
                Double NumberContainer = (1 / Double.parseDouble(
                        tField.getText()));
                tField.setText("" + NumberContainer);
            }

            // ------------ Menu Item Actions ------------ //
            if (a.getSource() == fmi1) {
                cv = tField.getText();
            }

            if (a.getSource() == fmi2) {
                tField.setText("" + cv);
            }

            if (a.getSource() == fmi3) {
                System.exit(0);
            }

        } // End of Try
        //|-------- Attempting To Catch Runtime Errors ---------| 
        catch (StringIndexOutOfBoundsException str) {
        } catch (NumberFormatException nfe) {
        } catch (NullPointerException npe) {
        }

    }

    private static class math {

        public math() {
        }
    }

    public static void main(String[] args) {
        Calculator s = new Calculator();
        s.launchFrame();
    }

}
