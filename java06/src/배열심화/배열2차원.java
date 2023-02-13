package 배열심화;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 배열2차원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				JFrame f = new JFrame();
				f.setSize(500, 500);
				String header[] = {"a", "b", "c"};
				String contents[][] = {
						{"1", "2", "4"}, {"2", "3", "4"}, {"7", "7", "7"},
						{"2", "4", "6"}, {"5", "6", "7"}, {"8", "9", "8"}
				};
				JTable t = new JTable(contents, header);
				JScrollPane scroll = new JScrollPane(t);
				f.add(scroll);
				f.setVisible(true);
				
				
	}

}
