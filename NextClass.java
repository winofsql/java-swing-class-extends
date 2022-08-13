import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class NextClass extends MyClass {

    public NextClass() {

    }

    public NextClass(String v) {
        super(v);
    }

    /**
     * @param top
     * @param contentPane
     */
    public static void init(WinMain top,JPanel contentPane) {

        top.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        top.setBounds(100, 100, 450, 300);

        // 中央表示
        top.setLocationRelativeTo(null);
        // タイトル設定
        top.setTitle("WindowBuilder");

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        top.setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton = new JButton("実行");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("こんにちは世界");
            }
        });
        btnNewButton.setBounds(160, 50, 90, 20);
        contentPane.add(btnNewButton);
    }


}
