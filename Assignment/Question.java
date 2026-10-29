package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Question extends JFrame {
    String QUsname;
    String op1;
    String op2;
    String op3;
    String op4;
    int correctAns;

    public Question( String QUsname, String op1, String op2, String op3, String op4, int correctAns)  {
        super();
        this.QUsname = QUsname;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.correctAns = correctAns;
    }

    public static int point;


  public ArrayList<Question> QUS = new ArrayList<>();
  Question(int a){


      try {
          BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\SayeedTonik\\IdeaProjects\\untitled\\src\\Assignment\\questions.txt"));



          String line;
          while ((line = br.readLine())!=null) {




              String[] A = line.split(",");

              QUS.add(new Question(A[0], A[1], A[2], A[3], A[4], Integer.parseInt(A[5])));

          }
          br.close();
      }

      catch( Exception e){
          e.getMessage();

      }

  }



    Question() {

        this(1);
        setTitle("SwingQuizApp");




        JLabel Q = new JLabel(QUS.get(0).QUsname);
        //Q.setBounds(150,50,100,15);

        JRadioButton[] a= new JRadioButton[4];
         a[0] = new JRadioButton(QUS.get(0).op1);

         a[1] = new JRadioButton(QUS.get(0).op2);
         a[2] = new JRadioButton(QUS.get(0).op3);
         a[3] = new JRadioButton(QUS.get(0).op4);

        ButtonGroup Group = new ButtonGroup();
        Group.add(a[0]);
        Group.add(a[1]);
        Group.add(a[2]);
        Group.add(a[3]);


        add(Q);
        add(a[0]);
        add(a[1]);
        add(a[2]);
        add(a[3]);





        JButton Jf = new JButton("Next");
        add(Jf);
        Q.setBounds(150,50,200,15);
        a[0].setBounds(150,70,100,30);
        a[1].setBounds(150,90,100,30);
        a[2].setBounds(150,110,100,30);
        a[3].setBounds(150,130,100,30);
        Jf.setBounds(150,170,100,30);

        ActionListener c = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a[QUS.get(0).correctAns].isSelected()){
                   point++;


                }
            }
        };

        Jf.addActionListener(c);
        ActionListener b = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Question2();
                dispose();
            }
        };
        Jf.addActionListener(b);

        setLayout(null);
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

    public static void main(String[] args) {
        Question a = new Question();
    }

}
class Question2 extends Question{
    Question2(){
super(1);
        setTitle("SwingQuizApp");





    JLabel Q = new JLabel(QUS.get(1).QUsname);
        JRadioButton[] a= new JRadioButton[4];
        a[0] = new JRadioButton(QUS.get(1).op1);
        a[1] = new JRadioButton(QUS.get(1).op2);
        a[2] = new JRadioButton(QUS.get(1).op3);
        a[3] = new JRadioButton(QUS.get(1).op4);
        ButtonGroup Group = new ButtonGroup();
        Group.add(a[0]);
        Group.add(a[1]);
        Group.add(a[2]);
        Group.add(a[3]);
        add(Q);
        add(a[0]);
        add(a[1]);
        add(a[2]);
        add(a[3]);


    JButton Jf = new JButton("Next");
    add(Jf);
        Q.setBounds(150,50,200,15);
        a[0].setBounds(150,70,100,30);
        a[1].setBounds(150,90,100,30);
        a[2].setBounds(150,110,100,30);
        a[3].setBounds(150,130,100,30);
        Jf.setBounds(150,170,100,30);
    ActionListener b = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new Question3();
            dispose();
        }
    };
        ActionListener c = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a[QUS.get(1).correctAns].isSelected()){
                    point++;


                }
            }
        };

        Jf.addActionListener(c);
        Jf.addActionListener(b);
    setLayout(null);
    setVisible(true);
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Question2();
    }
}
class Question3 extends Question{
    Question3(){
        super(1);
        setTitle("SwingQuizApp");





        JLabel Q = new JLabel(QUS.get(2).QUsname);
        JRadioButton[] a= new JRadioButton[4];
        a[0] = new JRadioButton(QUS.get(2).op1);
        a[1] = new JRadioButton(QUS.get(2).op2);
        a[2] = new JRadioButton(QUS.get(2).op3);
        a[3] = new JRadioButton(QUS.get(2).op4);
        ButtonGroup Group = new ButtonGroup();
        Group.add(a[0]);
        Group.add(a[1]);
        Group.add(a[2]);
        Group.add(a[3]);
        add(Q);
        add(a[0]);
        add(a[1]);
        add(a[2]);
        add(a[3]);


        JButton Jf = new JButton("Next");
        add(Jf);
        Q.setBounds(150,50,200,15);
        a[0].setBounds(150,70,100,30);
        a[1].setBounds(150,90,100,30);
        a[2].setBounds(150,110,100,30);
        a[3].setBounds(150,130,100,30);
        Jf.setBounds(150,170,100,30);
        ActionListener b = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent b) {
                new Question4();
                dispose();
            }
        };
        ActionListener c = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a[QUS.get(2).correctAns].isSelected()){
                    point++;


                }
            }
        };

        Jf.addActionListener(c);
        Jf.addActionListener(b);
        setLayout(null);
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Question3();
    }
}
class Question4 extends Question{
    Question4(){
        super(1);
        setTitle("SwingQuizApp");





        JLabel Q = new JLabel(QUS.get(3).QUsname);
        JRadioButton[] a= new JRadioButton[4];
        a[0] = new JRadioButton(QUS.get(3).op1);
        a[1] = new JRadioButton(QUS.get(3).op2);
        a[2] = new JRadioButton(QUS.get(3).op3);
        a[3] = new JRadioButton(QUS.get(3).op4);
        ButtonGroup Group = new ButtonGroup();
        Group.add(a[0]);
        Group.add(a[1]);
        Group.add(a[2]);
        Group.add(a[3]);
        add(Q);
        add(a[0]);
        add(a[1]);
        add(a[2]);
        add(a[3]);


        JButton Jf = new JButton("Next");
        add(Jf);
        Q.setBounds(150,50,200,15);
        a[0].setBounds(150,70,100,30);
        a[1].setBounds(150,90,100,30);
        a[2].setBounds(150,110,100,30);
        a[3].setBounds(150,130,100,30);
        Jf.setBounds(150,170,100,30);
        ActionListener b = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Question5();
                dispose();
            }
        };
        ActionListener c = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a[QUS.get(3).correctAns].isSelected()){
                    point++;


                }
            }
        };

        Jf.addActionListener(c);
        Jf.addActionListener(b);
        setLayout(null);
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Question4();
    }
}class Question5 extends Question{
    Question5(){
        super(1);
        setTitle("SwingQuizApp");





        JLabel Q = new JLabel(QUS.get(4).QUsname);
        JRadioButton[] a= new JRadioButton[4];
        a[0] = new JRadioButton(QUS.get(4).op1);
        a[1] = new JRadioButton(QUS.get(4).op2);
        a[2] = new JRadioButton(QUS.get(4).op3);
        a[3] = new JRadioButton(QUS.get(4).op4);
        ButtonGroup Group = new ButtonGroup();
        Group.add(a[0]);
        Group.add(a[1]);
        Group.add(a[2]);
        Group.add(a[3]);
        add(Q);
        add(a[0]);
        add(a[1]);
        add(a[2]);
        add(a[3]);


        JButton Jf = new JButton("Finish");
        add(Jf);
        ActionListener c = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a[QUS.get(4).correctAns].isSelected()){
                    point++;


                }
            }
        };
        ActionListener b = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Last();
                dispose();
            }
        };
        Q.setBounds(150,50,200,15);
        a[0].setBounds(150,70,100,30);
        a[1].setBounds(150,90,100,30);
        a[2].setBounds(150,110,100,30);
        a[3].setBounds(150,130,100,30);
        Jf.setBounds(150,170,100,30);

        Jf.addActionListener(c);
        Jf.addActionListener(b);
        setLayout(null);
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Question5();
    }
}
class Last extends  Question{

     Last() {
         super(1);
         setTitle("SwingQuizApp");
         //System.out.println("point="+point);
         JButton jb = new JButton("point");
         JLabel a = new JLabel("");
         ActionListener Al = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 a.setText("="+point);

             }
         };
         add(jb);
         add(a);


         jb.addActionListener(Al);


         setLayout(new FlowLayout());
         setVisible(true);
         setSize(400, 400);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

    public static void main(String[] args) {

         Last a = new Last();
    }



}
