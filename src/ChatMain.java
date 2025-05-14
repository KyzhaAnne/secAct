import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatMain {
    public static void main(String[] args) {
        ChatSec frame1 = new ChatSec();
        ChatSec frame2 = new ChatSec();

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
//<<<<<<< HEAD
        frame1.setTitle("CHATMATE kyzha");
        frame2.setTitle("CHATMATE 234");
=======
        frame1.setTitle("Jolibee123");
        frame2.setTitle("McDonald123");
//>>>>>>> f80572a2a333fd85b6bb39dd5b36cb5b0e26f3b1
=======
        frame1.setTitle("Silay");
        frame2.setTitle("tatlo ka talisay");
>>>>>>> origin
=======
        frame1.setTitle("Ako");
        frame2.setTitle("Kamo");
>>>>>>> 71133d831d6add4a9eef90c0477de5351c170d54
=======
        frame1.setTitle("Ako//");
        frame2.setTitle("Kamo//");
>>>>>>> 8ce3e74bb7751153cc23b8e6ef639ceb3a689689
        frame1.setSize(400, 230);
        frame2.setSize(400, 230);

        frame1.sumbit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String chatbox = frame1.chatField.getText();
                if (!chatbox.isEmpty()) {
                    frame1.displayField.append("CHATMATE 1: " + chatbox + "\n"); // Display in Chat 1
                    frame2.displayField.append("CHATMATE 1: " + chatbox + "\n"); // Display in Chat 2
                    frame1.chatField.setText(""); // Clear input field after sending
                }
            }
        });

        frame2.sumbit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String chatbox = frame2.chatField.getText();
                if (!chatbox.isEmpty()) {
                    frame2.displayField.append("CHATMATE 2: " + chatbox + "\n"); // Display in Chat 2
                    frame1.displayField.append("CHATMATE 2: " + chatbox + "\n"); // Display in Chat 1
                    frame2.chatField.setText(""); // Clear input field after sending
                }
            }
        });
    }
}
