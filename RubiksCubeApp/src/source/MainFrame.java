package source;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import swing components
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class MainFrame extends JFrame{
	
	
	private JButton scrambleBtn=new JButton("generate scramble");
	private JTextArea scrambleArea = new JTextArea(5,25);
	private JPanel timerPane = new JPanel();
	private JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JPanel homePane = new JPanel();
	private JButton startBtn = new JButton("Start");
	private JTextArea timerArea = new JTextArea();
	private final JTextArea prevtArea = new JTextArea();
	private final JTextArea statArea = new JTextArea();
	private final JLabel lblStatistics = new JLabel("Statistics");
	private JTextField redCenter;
	private JTextField red1;
	private JTextField red5;
	private JTextField red3;
	private JTextField red4;
	private JTextField red2;
	private JTextField red6;
	private JTextField red7;
	private JTextField red0;
	private  JTextField blue6 = new JTextField();
	private  JTextField blue7 = new JTextField();
	private  JTextField blue0 = new JTextField();
	private  JTextField blue5 = new JTextField();
	private  JTextField blue4 = new JTextField();
	private  JTextField blue3 = new JTextField();
	private  JTextField blue2 = new JTextField();
	private  JTextField blue1 = new JTextField();
	private final JTextField blueCenter = new JTextField();
	private  JTextField orange6 = new JTextField();
	private  JTextField orange7 = new JTextField();
	private  JTextField orange0 = new JTextField();
	private  JTextField orange5 = new JTextField();
	private  JTextField orange4 = new JTextField();
	private  JTextField orange3 = new JTextField();
	private  JTextField orange2 = new JTextField();
	private  JTextField orange1 = new JTextField();
	private final JTextField orangeCenter = new JTextField();
	private  JTextField green6 = new JTextField();
	private  JTextField green7 = new JTextField();
	private  JTextField green0 = new JTextField();
	private  JTextField green5 = new JTextField();
	private  JTextField green4 = new JTextField();
	private  JTextField green3 = new JTextField();
	private  JTextField green2 = new JTextField();
	private  JTextField green1 = new JTextField();
	private final JTextField greenCenter = new JTextField();
	private  JTextField white5 = new JTextField();
	private  JTextField white6 = new JTextField();
	private  JTextField white7 = new JTextField();
	private  JTextField white4 = new JTextField();
	private  JTextField white3 = new JTextField();
	private  JTextField white2 = new JTextField();
	private  JTextField white1 = new JTextField();
	private  JTextField white0 = new JTextField();
	private final JTextField whiteCenter = new JTextField();
	private  JTextField yellow3 = new JTextField();
	private  JTextField yellow2 = new JTextField();
	private  JTextField yellow1 = new JTextField();
	private  JTextField yellow4 = new JTextField();
	private  JTextField yellow5 = new JTextField();
	private  JTextField yellow6 = new JTextField();
	private  JTextField yellow7 = new JTextField();
	private  JTextField yellow0 = new JTextField();
	private final JTextField yellowCenter = new JTextField();

	
	
	public static void main(String[] args) {
		
		new MainFrame();
	}
	
	public MainFrame() {
		super("Rubik's Cube App");
		getContentPane().add(tabbedPane);
		
		tabbedPane.addTab("Home", null, homePane, null);
		homePane.setLayout(null);
		
		JTextArea txtrRubiksCubeProgram = new JTextArea();
		txtrRubiksCubeProgram.setFont(new Font("Monospaced", Font.BOLD, 70));
		txtrRubiksCubeProgram.setText("Rubik's Cube Program");
		txtrRubiksCubeProgram.setBounds(120, 209, 851, 127);
		homePane.add(txtrRubiksCubeProgram);
		tabbedPane.addTab("Timer", null, timerPane, null);
		timerPane.setLayout(null);
		scrambleBtn.setBounds(269, 35, 158, 31);
		startBtn.setBounds(530, 353, 89, 23);
		timerPane.add(startBtn);
		timerPane.add(scrambleBtn);
		scrambleArea.setBounds(473, 38, 204, 43);
		timerPane.add(scrambleArea);
		timerArea.setText("00:00");
		timerArea.setEditable(false);
		timerArea.setFont(new Font("Monospaced", Font.BOLD, 70));
		timerArea.setBounds(473, 209, 345, 121);
		timerPane.add(timerArea);
		
		JButton stopBtn = new JButton("Stop");
		stopBtn.setBounds(660, 353, 89, 23);
		timerPane.add(stopBtn);
		prevtArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		prevtArea.setEditable(false);
		prevtArea.setBounds(32, 97, 144, 471);
		
		timerPane.add(prevtArea);
		
		JLabel lblPreviousTimes = new JLabel("Previous Times");
		lblPreviousTimes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPreviousTimes.setBounds(25, 65, 165, 36);
		timerPane.add(lblPreviousTimes);
		statArea.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		statArea.setBounds(445, 480, 382, 173);
		
		timerPane.add(statArea);
		lblStatistics.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStatistics.setBounds(445, 451, 116, 18);
		
		timerPane.add(lblStatistics);
		
		JButton exportBtn = new JButton("Export Times");
		exportBtn.setBounds(64, 612, 112, 31);
		timerPane.add(exportBtn);
		
		redCenter = new JTextField();
		redCenter.setBackground(Color.RED);
		redCenter.setEditable(false);
		redCenter.setBounds(931, 99, 26, 26);
		timerPane.add(redCenter);
		redCenter.setColumns(10);
		
		red1 = new JTextField();
		red1.setEditable(false);
		red1.setColumns(10);
		red1.setBackground(Color.RED);	
		red1.setBounds(957, 99, 26, 26);
		timerPane.add(red1);
		
		red5 = new JTextField();
		red5.setEditable(false);
		red5.setColumns(10);
		red5.setBackground(Color.RED);
		red5.setBounds(905, 99, 26, 26);
		timerPane.add(red5);
		
		red3 = new JTextField();
		red3.setEditable(false);
		red3.setColumns(10);
		red3.setBackground(Color.RED);	
		red3.setBounds(931, 125, 26, 26);
		timerPane.add(red3);
		
		red4 = new JTextField();
		red4.setEditable(false);
		red4.setColumns(10);
		red4.setBackground(Color.RED);
		red4.setBounds(905, 125, 26, 26);
		timerPane.add(red4);
		
		red2 = new JTextField();
		red2.setEditable(false);
		red2.setColumns(10);
		red2.setBackground(Color.RED);
		red2.setBounds(957, 125, 26, 26);
		timerPane.add(red2);
		
		red6 = new JTextField();
		red6.setEditable(false);
		red6.setColumns(10);
		red6.setBackground(Color.RED);
		red6.setBounds(905, 77, 26, 26);
		timerPane.add(red6);
		
		red7 = new JTextField();
		red7.setEditable(false);
		red7.setColumns(10);
		red7.setBackground(Color.RED);
		red7.setBounds(931, 77, 26, 26);
		timerPane.add(red7);
		
		red0 = new JTextField();
		red0.setEditable(false);
		red0.setColumns(10);
		red0.setBackground(Color.RED);
		red0.setBounds(957, 77, 26, 26);
		timerPane.add(red0);
		
		blue6.setEditable(false);
		blue6.setColumns(10);
		blue6.setBackground(Color.BLUE);
		blue6.setBounds(988, 77, 26, 26);
		
		timerPane.add(blue6);
		blue7.setEditable(false);
		blue7.setColumns(10);
		blue7.setBackground(Color.BLUE);
		blue7.setBounds(1014, 77, 26, 26);
		
		timerPane.add(blue7);
		blue0.setEditable(false);
		blue0.setColumns(10);
		blue0.setBackground(Color.BLUE);
		blue0.setBounds(1040, 77, 26, 26);
		
		timerPane.add(blue0);
		blue5.setEditable(false);
		blue5.setColumns(10);
		blue5.setBackground(Color.BLUE);
		blue5.setBounds(988, 99, 26, 26);
		
		timerPane.add(blue5);
		blue4.setEditable(false);
		blue4.setColumns(10);
		blue4.setBackground(Color.BLUE);
		blue4.setBounds(988, 125, 26, 26);
		
		timerPane.add(blue4);
		blue3.setEditable(false);
		blue3.setColumns(10);
		blue3.setBackground(Color.BLUE);
		blue3.setBounds(1014, 125, 26, 26);
		
		timerPane.add(blue3);
		blue2.setEditable(false);
		blue2.setColumns(10);
		blue2.setBackground(Color.BLUE);
		blue2.setBounds(1040, 125, 26, 26);
		
		timerPane.add(blue2);
		blue1.setEditable(false);
		blue1.setColumns(10);
		blue1.setBackground(Color.BLUE);
		blue1.setBounds(1040, 99, 26, 26);
		
		timerPane.add(blue1);
		blueCenter.setEditable(false);
		blueCenter.setColumns(10);
		blueCenter.setBackground(Color.BLUE);
		blueCenter.setBounds(1014, 99, 26, 26);
		
		timerPane.add(blueCenter);
		orange6.setEditable(false);
		orange6.setColumns(10);
		orange6.setBackground(Color.ORANGE);
		orange6.setBounds(1068, 77, 26, 26);
		
		timerPane.add(orange6);
		orange7.setEditable(false);
		orange7.setColumns(10);
		orange7.setBackground(Color.ORANGE); 
		orange7.setBounds(1094, 77, 26, 26);
		
		timerPane.add(orange7);
		orange0.setEditable(false);
		orange0.setColumns(10);
		orange0.setBackground(Color.ORANGE); 
		orange0.setBounds(1120, 77, 26, 26);
		
		timerPane.add(orange0);
		orange5.setEditable(false);
		orange5.setColumns(10);
		orange5.setBackground(Color.ORANGE);
		orange5.setBounds(1068, 99, 26, 26);
		
		timerPane.add(orange5);
		orange4.setEditable(false);
		orange4.setColumns(10);
		orange4.setBackground(Color.ORANGE);
		orange4.setBounds(1068, 125, 26, 26);
		
		timerPane.add(orange4);
		orange3.setEditable(false);
		orange3.setColumns(10);
		orange3.setBackground(Color.ORANGE);
		orange3.setBounds(1094, 125, 26, 26);
		
		timerPane.add(orange3);
		orange2.setEditable(false);
		orange2.setColumns(10);
		orange2.setBackground(Color.ORANGE);
		orange2.setBounds(1120, 125, 26, 26);
		
		timerPane.add(orange2);
		orange1.setEditable(false);
		orange1.setColumns(10);
		orange1.setBackground(Color.ORANGE); 
		orange1.setBounds(1120, 99, 26, 26);
		
		timerPane.add(orange1);
		orangeCenter.setEditable(false);
		orangeCenter.setColumns(10);
		orangeCenter.setBackground(Color.ORANGE);
		orangeCenter.setBounds(1094, 99, 26, 26);
		
		timerPane.add(orangeCenter);
		green6.setEditable(false);
		green6.setColumns(10);
		green6.setBackground(Color.GREEN);
		green6.setBounds(826, 77, 26, 26);
		timerPane.add(green6);
		
		green7.setEditable(false);
		green7.setColumns(10);
		green7.setBackground(Color.GREEN);
		green7.setBounds(852, 77, 26, 26);
		
		timerPane.add(green7);
		green0.setEditable(false);
		green0.setColumns(10);
		green0.setBackground(Color.GREEN);
		green0.setBounds(878, 77, 26, 26);
		
		timerPane.add(green0);
		green5.setEditable(false);
		green5.setColumns(10);
		green5.setBackground(Color.GREEN);
		green5.setBounds(826, 99, 26, 26);
		
		timerPane.add(green5);
		green4.setEditable(false);
		green4.setColumns(10);
		green4.setBackground(Color.GREEN);
		green4.setBounds(826, 125, 26, 26);
		
		timerPane.add(green4);
		green3.setEditable(false);
		green3.setColumns(10);
		green3.setBackground(Color.GREEN);
		green3.setBounds(852, 125, 26, 26);
		
		timerPane.add(green3);
		green2.setEditable(false);
		green2.setColumns(10);
		green2.setBackground(Color.GREEN);
		green2.setBounds(878, 125, 26, 26);
		
		timerPane.add(green2);
		green1.setEditable(false);
		green1.setColumns(10);
		green1.setBackground(Color.GREEN);
		green1.setBounds(878, 99, 26, 26);
		
		timerPane.add(green1);
		greenCenter.setEditable(false);
		greenCenter.setColumns(10);
		greenCenter.setBackground(Color.GREEN);
		greenCenter.setBounds(852, 99, 26, 26);
		
		timerPane.add(greenCenter);
		white5.setEditable(false);
		white5.setColumns(10);
		white5.setBackground(Color.WHITE);
		white5.setBounds(905, 0, 26, 26);
		
		timerPane.add(white5);
		white6.setEditable(false);
		white6.setColumns(10);
		white6.setBackground(Color.WHITE);
		white6.setBounds(931, 0, 26, 26);
		
		timerPane.add(white6);
		white7.setEditable(false);
		white7.setColumns(10);
		white7.setBackground(Color.WHITE);
		white7.setBounds(957, 0, 26, 26);
		
		timerPane.add(white7);
		white4.setEditable(false);
		white4.setColumns(10);
		white4.setBackground(Color.WHITE);
		white4.setBounds(905, 22, 26, 26);
		
		timerPane.add(white4);
		white3.setEditable(false);
		white3.setColumns(10);
		white3.setBackground(Color.WHITE);
		white3.setBounds(905, 48, 26, 26);
		
		timerPane.add(white3);
		white2.setEditable(false);
		white2.setColumns(10);
		white2.setBackground(Color.WHITE);
		white2.setBounds(931, 48, 26, 26);
		
		timerPane.add(white2);
		white1.setEditable(false);
		white1.setColumns(10);
		white1.setBackground(Color.WHITE);
		white1.setBounds(957, 48, 26, 26);
		
		timerPane.add(white1);
		white0.setEditable(false);
		white0.setColumns(10);
		white0.setBackground(Color.WHITE);
		white0.setBounds(957, 22, 26, 26);
		
		timerPane.add(white0);
		whiteCenter.setEditable(false);
		whiteCenter.setColumns(10);
	    whiteCenter.setBackground(Color.WHITE);
		whiteCenter.setBounds(931, 22, 26, 26);
		
		timerPane.add(whiteCenter);
		yellow3.setEditable(false);
		yellow3.setColumns(10);
		yellow3.setBackground(Color.YELLOW);
		yellow3.setBounds(905, 152, 26, 26);
		
		timerPane.add(yellow3);
		yellow2.setEditable(false);
		yellow2.setColumns(10);
		yellow2.setBackground(Color.YELLOW);
		yellow2.setBounds(931, 152, 26, 26);
		
		timerPane.add(yellow2);
		yellow1.setEditable(false);
		yellow1.setColumns(10);
		yellow1.setBackground(Color.YELLOW);
		yellow1.setBounds(957, 152, 26, 26);
		
		timerPane.add(yellow1);
		yellow4.setEditable(false);
		yellow4.setColumns(10);
		yellow4.setBackground(Color.YELLOW);
		yellow4.setBounds(905, 174, 26, 26);
		
		timerPane.add(yellow4);
		yellow5.setEditable(false);
		yellow5.setColumns(10);
		yellow5.setBackground(Color.YELLOW);
		yellow5.setBounds(905, 200, 26, 26);
		
		timerPane.add(yellow5);
		yellow6.setEditable(false);
		yellow6.setColumns(10);
		yellow6.setBackground(Color.YELLOW);
		yellow6.setBounds(931, 200, 26, 26);
		
		timerPane.add(yellow6);
		yellow7.setEditable(false);
		yellow7.setColumns(10);
		yellow7.setBackground(Color.YELLOW);
		yellow7.setBounds(957, 200, 26, 26);
		
		timerPane.add(yellow7);
		yellow0.setEditable(false);
		yellow0.setColumns(10);
		yellow0.setBackground(Color.YELLOW);
		yellow0.setBounds(957, 174, 26, 26);
		
		timerPane.add(yellow0);
		yellowCenter.setEditable(false);
		yellowCenter.setColumns(10);
		yellowCenter.setBackground(Color.YELLOW);
		yellowCenter.setBounds(931, 174, 26, 26);
		
		timerPane.add(yellowCenter);
		
		
		
//button functionality
		
		/*scrambleBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Scrambler obj = new Scrambler();
				obj.createScramble();
				scrambleArea.setText(Scrambler.scramble);
				
			}
		
			
		});
		*/
		scrambleBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==scrambleBtn) {
					
					//cube colors are reset
					red1.setBackground(Color.RED);
					red5.setBackground(Color.RED);
					red3.setBackground(Color.RED);
					red4.setBackground(Color.RED);
					red2.setBackground(Color.RED);
					red6.setBackground(Color.RED);
					red7.setBackground(Color.RED);
					red0.setBackground(Color.RED);

					blue0.setBackground(Color.BLUE);
					blue1.setBackground(Color.BLUE);
					blue2.setBackground(Color.BLUE);
					blue3.setBackground(Color.BLUE);
					blue4.setBackground(Color.BLUE);
					blue5.setBackground(Color.BLUE);
					blue6.setBackground(Color.BLUE);
					blue7.setBackground(Color.BLUE);

					orange0.setBackground(Color.ORANGE);
					orange1.setBackground(Color.ORANGE);
					orange2.setBackground(Color.ORANGE);
					orange3.setBackground(Color.ORANGE);
					orange4.setBackground(Color.ORANGE);
					orange5.setBackground(Color.ORANGE);
					orange6.setBackground(Color.ORANGE);
					orange7.setBackground(Color.ORANGE);

					green0.setBackground(Color.GREEN);
					green1.setBackground(Color.GREEN);
					green2.setBackground(Color.GREEN);
					green3.setBackground(Color.GREEN);
					green4.setBackground(Color.GREEN);
					green5.setBackground(Color.GREEN);
					green6.setBackground(Color.GREEN);
					green7.setBackground(Color.GREEN);

					white0.setBackground(Color.WHITE);
					white1.setBackground(Color.WHITE);
					white2.setBackground(Color.WHITE);
					white3.setBackground(Color.WHITE);
					white4.setBackground(Color.WHITE);
					white5.setBackground(Color.WHITE);
					white6.setBackground(Color.WHITE);
					white7.setBackground(Color.WHITE);

					yellow0.setBackground(Color.YELLOW);
					yellow1.setBackground(Color.YELLOW);
					yellow2.setBackground(Color.YELLOW);
					yellow3.setBackground(Color.YELLOW);
					yellow4.setBackground(Color.YELLOW);
					yellow5.setBackground(Color.YELLOW);
					yellow6.setBackground(Color.YELLOW);
					yellow7.setBackground(Color.YELLOW);
				
					//scramble is generated	
					Scrambler obj = new Scrambler();
					obj.createScramble();
					scrambleArea.setText(Scrambler.scramble);
					
				//scramble moves are done	
					for(int i = 0; i<20; i++) {
						
						if(Scrambler.arr[i]=='R') {VisualScramble.rotate('R');
						}else if(Scrambler.arr[i]=='U') {VisualScramble.rotate('U');
						}else if(Scrambler.arr[i]=='L') {VisualScramble.rotate('L');
						}else if(Scrambler.arr[i]=='D') {VisualScramble.rotate('D');
						}else if(Scrambler.arr[i]=='F') { VisualScramble.rotate('F');
						}else if(Scrambler.arr[i]=='B') {VisualScramble.rotate('B');
						}else if(Scrambler.arr[i]=='2') {
							if(Scrambler.arr[i-1]=='U') VisualScramble.rotate('U');
							if(Scrambler.arr[i-1]=='L') VisualScramble.rotate('L');
							if(Scrambler.arr[i-1]=='D') VisualScramble.rotate('D');
							if(Scrambler.arr[i-1]=='F') VisualScramble.rotate('F');
							if(Scrambler.arr[i-1]=='B') VisualScramble.rotate('B');
							
						}
						
						
						
						
					}
					
					if (VisualScramble.red[1] == 'w') red1.setBackground(Color.WHITE);	
					if (VisualScramble.red[1] == 'y') red1.setBackground(Color.YELLOW);
					if (VisualScramble.red[1] == 'g') red1.setBackground(Color.GREEN);
					if (VisualScramble.red[1] == 'b') red1.setBackground(Color.BLUE);
					if (VisualScramble.red[1] == 'r') red1.setBackground(Color.RED);
					if (VisualScramble.red[1] == 'o') red1.setBackground(Color.ORANGE);
						
					if (VisualScramble.red[5] == 'w') red5.setBackground(Color.WHITE);	
					if (VisualScramble.red[5] == 'y') red5.setBackground(Color.YELLOW);
					if (VisualScramble.red[5] == 'g') red5.setBackground(Color.GREEN);
					if (VisualScramble.red[5] == 'b') red5.setBackground(Color.BLUE);
					if (VisualScramble.red[5] == 'r') red5.setBackground(Color.RED);
					if (VisualScramble.red[5] == 'o') red5.setBackground(Color.ORANGE);

					if (VisualScramble.red[3] == 'w') red3.setBackground(Color.WHITE);	
					if (VisualScramble.red[3] == 'y') red3.setBackground(Color.YELLOW);
					if (VisualScramble.red[3] == 'g') red3.setBackground(Color.GREEN);
					if (VisualScramble.red[3] == 'b') red3.setBackground(Color.BLUE);
					if (VisualScramble.red[3] == 'r') red3.setBackground(Color.RED);
					if (VisualScramble.red[3] == 'o') red3.setBackground(Color.ORANGE);

					if (VisualScramble.red[4] == 'w') red4.setBackground(Color.WHITE);	
					if (VisualScramble.red[4] == 'y') red4.setBackground(Color.YELLOW);
					if (VisualScramble.red[4] == 'g') red4.setBackground(Color.GREEN);
					if (VisualScramble.red[4] == 'b') red4.setBackground(Color.BLUE);
					if (VisualScramble.red[4] == 'r') red4.setBackground(Color.RED);
					if (VisualScramble.red[4] == 'o') red4.setBackground(Color.ORANGE);	

					if (VisualScramble.red[2] == 'w') red2.setBackground(Color.WHITE);	
					if (VisualScramble.red[2] == 'y') red2.setBackground(Color.YELLOW);
					if (VisualScramble.red[2] == 'g') red2.setBackground(Color.GREEN);
					if (VisualScramble.red[2] == 'b') red2.setBackground(Color.BLUE);
					if (VisualScramble.red[2] == 'r') red2.setBackground(Color.RED);
					if (VisualScramble.red[2] == 'o') red2.setBackground(Color.ORANGE);

					if (VisualScramble.red[6] == 'w') red6.setBackground(Color.WHITE);	
					if (VisualScramble.red[6] == 'y') red6.setBackground(Color.YELLOW);
					if (VisualScramble.red[6] == 'g') red6.setBackground(Color.GREEN);
					if (VisualScramble.red[6] == 'b') red6.setBackground(Color.BLUE);
					if (VisualScramble.red[6] == 'r') red6.setBackground(Color.RED);
					if (VisualScramble.red[6] == 'o') red6.setBackground(Color.ORANGE);	

					if (VisualScramble.red[7] == 'w') red7.setBackground(Color.WHITE);	
					if (VisualScramble.red[7] == 'y') red7.setBackground(Color.YELLOW);
					if (VisualScramble.red[7] == 'g') red7.setBackground(Color.GREEN);
					if (VisualScramble.red[7] == 'b') red7.setBackground(Color.BLUE);
					if (VisualScramble.red[7] == 'r') red7.setBackground(Color.RED);
					if (VisualScramble.red[7] == 'o') red7.setBackground(Color.ORANGE);	

					if (VisualScramble.red[0] == 'w') red0.setBackground(Color.WHITE);	
					if (VisualScramble.red[0] == 'y') red0.setBackground(Color.YELLOW);
					if (VisualScramble.red[0] == 'g') red0.setBackground(Color.GREEN);
					if (VisualScramble.red[0] == 'b') red0.setBackground(Color.BLUE);
					if (VisualScramble.red[0] == 'r') red0.setBackground(Color.RED);
					if (VisualScramble.red[0] == 'o') red0.setBackground(Color.ORANGE);
					if (VisualScramble.blue[6] == 'w') blue6.setBackground(Color.WHITE);	
					if (VisualScramble.blue[6] == 'y') blue6.setBackground(Color.YELLOW);
					if (VisualScramble.blue[6]== 'g') blue6.setBackground(Color.GREEN);
					if (VisualScramble.blue[6] == 'b') blue6.setBackground(Color.BLUE);
					if (VisualScramble.blue[6] == 'r') blue6.setBackground(Color.RED);
					if (VisualScramble.blue[6] == 'o') blue6.setBackground(Color.ORANGE);

					if (VisualScramble.blue[7] == 'w') blue7.setBackground(Color.WHITE);	
					if (VisualScramble.blue[7] == 'y') blue7.setBackground(Color.YELLOW);
					if (VisualScramble.blue[7]== 'g') blue7.setBackground(Color.GREEN);
					if (VisualScramble.blue[7] == 'b') blue7.setBackground(Color.BLUE);
					if (VisualScramble.blue[7] == 'r') blue7.setBackground(Color.RED);
					if (VisualScramble.blue[7] == 'o') blue7.setBackground(Color.ORANGE);

					if (VisualScramble.blue[0] == 'w') blue0.setBackground(Color.WHITE);	
					if (VisualScramble.blue[0] == 'y') blue0.setBackground(Color.YELLOW);
					if (VisualScramble.blue[0] == 'g') blue0.setBackground(Color.GREEN);
					if (VisualScramble.blue[0] == 'b') blue0.setBackground(Color.BLUE);
					if (VisualScramble.blue[0] == 'r') blue0.setBackground(Color.RED);
					if (VisualScramble.blue[0] == 'o') blue0.setBackground(Color.ORANGE);

					if (VisualScramble.blue[5] == 'w') blue5.setBackground(Color.WHITE);	
					if (VisualScramble.blue[5] == 'y') blue5.setBackground(Color.YELLOW);
					if (VisualScramble.blue[5] == 'g') blue5.setBackground(Color.GREEN);
					if (VisualScramble.blue[5] == 'b') blue5.setBackground(Color.BLUE);
					if (VisualScramble.blue[5] == 'r') blue5.setBackground(Color.RED);
					if (VisualScramble.blue[5] == 'o') blue5.setBackground(Color.ORANGE);

					if (VisualScramble.blue[4] == 'w') blue4.setBackground(Color.WHITE);	
					if (VisualScramble.blue[4] == 'y') blue4.setBackground(Color.YELLOW);
					if (VisualScramble.blue[4] == 'g') blue4.setBackground(Color.GREEN);
					if (VisualScramble.blue[4] == 'b') blue4.setBackground(Color.BLUE);
					if (VisualScramble.blue[4] == 'r') blue4.setBackground(Color.RED);
					if (VisualScramble.blue[4] == 'o') blue4.setBackground(Color.ORANGE);

					if (VisualScramble.blue[3] == 'w') blue3.setBackground(Color.WHITE);	
					if (VisualScramble.blue[3] == 'y') blue3.setBackground(Color.YELLOW);
					if (VisualScramble.blue[3] == 'g') blue3.setBackground(Color.GREEN);
					if (VisualScramble.blue[3] == 'b') blue3.setBackground(Color.BLUE);
					if (VisualScramble.blue[3] == 'r') blue3.setBackground(Color.RED);
					if (VisualScramble.blue[3] == 'o') blue3.setBackground(Color.ORANGE);

					if (VisualScramble.blue[2] == 'w') blue2.setBackground(Color.WHITE);	
					if (VisualScramble.blue[2] == 'y') blue2.setBackground(Color.YELLOW);
					if (VisualScramble.blue[2] == 'g') blue2.setBackground(Color.GREEN);
					if (VisualScramble.blue[2] == 'b') blue2.setBackground(Color.BLUE);
					if (VisualScramble.blue[2] == 'r') blue2.setBackground(Color.RED);
					if (VisualScramble.blue[2] == 'o') blue2.setBackground(Color.ORANGE);

					if (VisualScramble.blue[1] == 'w') blue1.setBackground(Color.WHITE);	
					if (VisualScramble.blue[1] == 'y') blue1.setBackground(Color.YELLOW);
					if (VisualScramble.blue[1] == 'g') blue1.setBackground(Color.GREEN);
					if (VisualScramble.blue[1] == 'b') blue1.setBackground(Color.BLUE);
					if (VisualScramble.blue[1] == 'r') blue1.setBackground(Color.RED);
					if (VisualScramble.blue[1] == 'o') blue1.setBackground(Color.ORANGE);

					if (VisualScramble.orange[6] == 'w') orange6.setBackground(Color.WHITE);	
					if (VisualScramble.orange[6] == 'y') orange6.setBackground(Color.YELLOW);
					if (VisualScramble.orange[6] == 'g') orange6.setBackground(Color.GREEN);
					if (VisualScramble.orange[6] == 'b') orange6.setBackground(Color.BLUE);
					if (VisualScramble.orange[6] == 'r') orange6.setBackground(Color.RED);
					if (VisualScramble.orange[6] == 'o') orange6.setBackground(Color.ORANGE);

					if (VisualScramble.orange[7] == 'w') orange7.setBackground(Color.WHITE);	
					if (VisualScramble.orange[7] == 'y') orange7.setBackground(Color.YELLOW);
					if (VisualScramble.orange[7] == 'g') orange7.setBackground(Color.GREEN);
					if (VisualScramble.orange[7] == 'b') orange7.setBackground(Color.BLUE);
					if (VisualScramble.orange[7] == 'r') orange7.setBackground(Color.RED);
					if (VisualScramble.orange[7] == 'o') orange7.setBackground(Color.ORANGE);

					if (VisualScramble.orange[0] == 'w') orange0.setBackground(Color.WHITE);	
					if (VisualScramble.orange[0] == 'y') orange0.setBackground(Color.YELLOW);
					if (VisualScramble.orange[0] == 'g') orange0.setBackground(Color.GREEN);
					if (VisualScramble.orange[0] == 'b') orange0.setBackground(Color.BLUE);
					if (VisualScramble.orange[0] == 'r') orange0.setBackground(Color.RED);
					if (VisualScramble.orange[0] == 'o') orange0.setBackground(Color.ORANGE);

					if (VisualScramble.orange[5] == 'w') orange5.setBackground(Color.WHITE);	
					if (VisualScramble.orange[5] == 'y') orange5.setBackground(Color.YELLOW);
					if (VisualScramble.orange[5] == 'g') orange5.setBackground(Color.GREEN);
					if (VisualScramble.orange[5] == 'b') orange5.setBackground(Color.BLUE);
					if (VisualScramble.orange[5] == 'r') orange5.setBackground(Color.RED);
					if (VisualScramble.orange[5] == 'o') orange5.setBackground(Color.ORANGE);

					if (VisualScramble.orange[4] == 'w') orange4.setBackground(Color.WHITE);	
					if (VisualScramble.orange[4] == 'y') orange4.setBackground(Color.YELLOW);
					if (VisualScramble.orange[4] == 'g') orange4.setBackground(Color.GREEN);
					if (VisualScramble.orange[4] == 'b') orange4.setBackground(Color.BLUE);
					if (VisualScramble.orange[4] == 'r') orange4.setBackground(Color.RED);
					if (VisualScramble.orange[4] == 'o') orange4.setBackground(Color.ORANGE);
					if (VisualScramble.orange[3] == 'w') orange3.setBackground(Color.WHITE);	
					if (VisualScramble.orange[3] == 'y') orange3.setBackground(Color.YELLOW);
					if (VisualScramble.orange[3] == 'g') orange3.setBackground(Color.GREEN);
					if (VisualScramble.orange[3] == 'b') orange3.setBackground(Color.BLUE);
					if (VisualScramble.orange[3] == 'r') orange3.setBackground(Color.RED);
					if (VisualScramble.orange[3] == 'o') orange3.setBackground(Color.ORANGE);

					if (VisualScramble.orange[2] == 'w') orange2.setBackground(Color.WHITE);	
					if (VisualScramble.orange[2] == 'y') orange2.setBackground(Color.YELLOW);
					if (VisualScramble.orange[2] == 'g') orange2.setBackground(Color.GREEN);
					if (VisualScramble.orange[2] == 'b') orange2.setBackground(Color.BLUE);
					if (VisualScramble.orange[2] == 'r') orange2.setBackground(Color.RED);
					if (VisualScramble.orange[2] == 'o') orange2.setBackground(Color.ORANGE);
					if (VisualScramble.orange[1] == 'w') orange1.setBackground(Color.WHITE);	
					if (VisualScramble.orange[1] == 'y') orange1.setBackground(Color.YELLOW);
					if (VisualScramble.orange[1] == 'g') orange1.setBackground(Color.GREEN);
					if (VisualScramble.orange[1] == 'b') orange1.setBackground(Color.BLUE);
					if (VisualScramble.orange[1] == 'r') orange1.setBackground(Color.RED);
					if (VisualScramble.orange[1] == 'o') orange1.setBackground(Color.ORANGE);

					if (VisualScramble.green[6] == 'w') green6.setBackground(Color.WHITE);	
					if (VisualScramble.green[6] == 'y') green6.setBackground(Color.YELLOW);
					if (VisualScramble.green[6] == 'g') green6.setBackground(Color.GREEN);
					if (VisualScramble.green[6] == 'b') green6.setBackground(Color.BLUE);
					if (VisualScramble.green[6] == 'r') green6.setBackground(Color.RED);
					if (VisualScramble.green[6] == 'o') green6.setBackground(Color.ORANGE);

					if (VisualScramble.green[7] == 'w') green7.setBackground(Color.WHITE);	
					if (VisualScramble.green[7] == 'y') green7.setBackground(Color.YELLOW);
					if (VisualScramble.green[7] == 'g') green7.setBackground(Color.GREEN);
					if (VisualScramble.green[7] == 'b') green7.setBackground(Color.BLUE);
					if (VisualScramble.green[7] == 'r') green7.setBackground(Color.RED);
					if (VisualScramble.green[7] == 'o') green7.setBackground(Color.ORANGE);

					if (VisualScramble.green[0] == 'w') green0.setBackground(Color.WHITE);	
					if (VisualScramble.green[0] == 'y') green0.setBackground(Color.YELLOW);
					if (VisualScramble.green[0] == 'g') green0.setBackground(Color.GREEN);
					if (VisualScramble.green[0] == 'b') green0.setBackground(Color.BLUE);
					if (VisualScramble.green[0] == 'r') green0.setBackground(Color.RED);
					if (VisualScramble.green[0] == 'o') green0.setBackground(Color.ORANGE);

					if (VisualScramble.green[5] == 'w') green5.setBackground(Color.WHITE);	
					if (VisualScramble.green[5] == 'y') green5.setBackground(Color.YELLOW);
					if (VisualScramble.green[5] == 'g') green5.setBackground(Color.GREEN);
					if (VisualScramble.green[5] == 'b') green5.setBackground(Color.BLUE);
					if (VisualScramble.green[5] == 'r') green5.setBackground(Color.RED);
					if (VisualScramble.green[5] == 'o') green5.setBackground(Color.ORANGE);

					if (VisualScramble.green[4] == 'w') green4.setBackground(Color.WHITE);	
					if (VisualScramble.green[4] == 'y') green4.setBackground(Color.YELLOW);
					if (VisualScramble.green[4] == 'g') green4.setBackground(Color.GREEN);
					if (VisualScramble.green[4] == 'b') green4.setBackground(Color.BLUE);
					if (VisualScramble.green[4] == 'r') green4.setBackground(Color.RED);
					if (VisualScramble.green[4] == 'o') green4.setBackground(Color.ORANGE);

					if (VisualScramble.green[3] == 'w') green3.setBackground(Color.WHITE);	
					if (VisualScramble.green[3] == 'y') green3.setBackground(Color.YELLOW);
					if (VisualScramble.green[3] == 'g') green3.setBackground(Color.GREEN);
					if (VisualScramble.green[3] == 'b') green3.setBackground(Color.BLUE);
					if (VisualScramble.green[3] == 'r') green3.setBackground(Color.RED);
					if (VisualScramble.green[3] == 'o') green3.setBackground(Color.ORANGE);

					if (VisualScramble.green[2] == 'w') green2.setBackground(Color.WHITE);	
					if (VisualScramble.green[2] == 'y') green2.setBackground(Color.YELLOW);
					if (VisualScramble.green[2] == 'g') green2.setBackground(Color.GREEN);
					if (VisualScramble.green[2] == 'b') green2.setBackground(Color.BLUE);
					if (VisualScramble.green[2] == 'r') green2.setBackground(Color.RED);
					if (VisualScramble.green[2] == 'o') green2.setBackground(Color.ORANGE);

					if (VisualScramble.green[1] == 'w') green1.setBackground(Color.WHITE);	
					if (VisualScramble.green[1] == 'y') green1.setBackground(Color.YELLOW);
					if (VisualScramble.green[1] == 'g') green1.setBackground(Color.GREEN);
					if (VisualScramble.green[1] == 'b') green1.setBackground(Color.BLUE);
					if (VisualScramble.green[1] == 'r') green1.setBackground(Color.RED);
					if (VisualScramble.green[1] == 'o') green1.setBackground(Color.ORANGE);
				
					if (VisualScramble.white[5] == 'w') white5.setBackground(Color.WHITE);	
					if (VisualScramble.white[5] == 'y') white5.setBackground(Color.YELLOW);
					if (VisualScramble.white[5] == 'g') white5.setBackground(Color.GREEN);
					if (VisualScramble.white[5] == 'b') white5.setBackground(Color.BLUE);
					if (VisualScramble.white[5] == 'r') white5.setBackground(Color.RED);
					if (VisualScramble.white[5] == 'o') white5.setBackground(Color.ORANGE);

					if (VisualScramble.white[6] == 'w') white6.setBackground(Color.WHITE);	
					if (VisualScramble.white[6] == 'y') white6.setBackground(Color.YELLOW);
					if (VisualScramble.white[6] == 'g') white6.setBackground(Color.GREEN);
					if (VisualScramble.white[6] == 'b') white6.setBackground(Color.BLUE);
					if (VisualScramble.white[6] == 'r') white6.setBackground(Color.RED);
					if (VisualScramble.white[6] == 'o') white6.setBackground(Color.ORANGE);

					if (VisualScramble.white[7] == 'w') white7.setBackground(Color.WHITE);	
					if (VisualScramble.white[7] == 'y') white7.setBackground(Color.YELLOW);
					if (VisualScramble.white[7] == 'g') white7.setBackground(Color.GREEN);
					if (VisualScramble.white[7] == 'b') white7.setBackground(Color.BLUE);
					if (VisualScramble.white[7] == 'r') white7.setBackground(Color.RED);
					if (VisualScramble.white[7] == 'o') white7.setBackground(Color.ORANGE);

					if (VisualScramble.white[4] == 'w') white4.setBackground(Color.WHITE);	
					if (VisualScramble.white[4] == 'y') white4.setBackground(Color.YELLOW);
					if (VisualScramble.white[4] == 'g') white4.setBackground(Color.GREEN);
					if (VisualScramble.white[4] == 'b') white4.setBackground(Color.BLUE);
					if (VisualScramble.white[4] == 'r') white4.setBackground(Color.RED);
					if (VisualScramble.white[4] == 'o') white4.setBackground(Color.ORANGE);

					if (VisualScramble.white[3] == 'w') white3.setBackground(Color.WHITE);	
					if (VisualScramble.white[3] == 'y') white3.setBackground(Color.YELLOW);
					if (VisualScramble.white[3] == 'g') white3.setBackground(Color.GREEN);
					if (VisualScramble.white[3] == 'b') white3.setBackground(Color.BLUE);
					if (VisualScramble.white[3] == 'r') white3.setBackground(Color.RED);
					if (VisualScramble.white[3] == 'o') white3.setBackground(Color.ORANGE);

					if (VisualScramble.white[2] == 'w') white2.setBackground(Color.WHITE);	
					if (VisualScramble.white[2] == 'y') white2.setBackground(Color.YELLOW);
					if (VisualScramble.white[2] == 'g') white2.setBackground(Color.GREEN);
					if (VisualScramble.white[2] == 'b') white2.setBackground(Color.BLUE);
					if (VisualScramble.white[2] == 'r') white2.setBackground(Color.RED);
					if (VisualScramble.white[2] == 'o') white2.setBackground(Color.ORANGE);

					if (VisualScramble.white[1] == 'w') white1.setBackground(Color.WHITE);	
					if (VisualScramble.white[1] == 'y') white1.setBackground(Color.YELLOW);
					if (VisualScramble.white[1] == 'g') white1.setBackground(Color.GREEN);
					if (VisualScramble.white[1] == 'b') white1.setBackground(Color.BLUE);
					if (VisualScramble.white[1] == 'r') white1.setBackground(Color.RED);
					if (VisualScramble.white[1] == 'o') white1.setBackground(Color.ORANGE);

					if (VisualScramble.white[0] == 'w') white0.setBackground(Color.WHITE);	
					if (VisualScramble.white[0] == 'y') white0.setBackground(Color.YELLOW);
					if (VisualScramble.white[0] == 'g') white0.setBackground(Color.GREEN);
					if (VisualScramble.white[0] == 'b') white0.setBackground(Color.BLUE);
					if (VisualScramble.white[0] == 'r') white0.setBackground(Color.RED);
					if (VisualScramble.white[0] == 'o') white0.setBackground(Color.ORANGE);


					if (VisualScramble.yellow[3] == 'w') yellow3.setBackground(Color.WHITE);	
					if (VisualScramble.yellow[3] == 'y') yellow3.setBackground(Color.YELLOW);
					if (VisualScramble.yellow[3] == 'g') yellow3.setBackground(Color.GREEN);
					if (VisualScramble.yellow[3] == 'b') yellow3.setBackground(Color.BLUE);
					if (VisualScramble.yellow[3] == 'r') yellow3.setBackground(Color.RED);
					if (VisualScramble.yellow[3] == 'o') yellow3.setBackground(Color.ORANGE);

					if (VisualScramble.yellow[2] == 'w') yellow2.setBackground(Color.WHITE);	
					if (VisualScramble.yellow[2] == 'y') yellow2.setBackground(Color.YELLOW);
					if (VisualScramble.yellow[2] == 'g') yellow2.setBackground(Color.GREEN);
					if (VisualScramble.yellow[2] == 'b') yellow2.setBackground(Color.BLUE);
					if (VisualScramble.yellow[2] == 'r') yellow2.setBackground(Color.RED);
					if (VisualScramble.yellow[2] == 'o') yellow2.setBackground(Color.ORANGE);

					if (VisualScramble.yellow[1] == 'w') yellow1.setBackground(Color.WHITE);	
					if (VisualScramble.yellow[1] == 'y') yellow1.setBackground(Color.YELLOW);
					if (VisualScramble.yellow[1] == 'g') yellow1.setBackground(Color.GREEN);
					if (VisualScramble.yellow[1] == 'b') yellow1.setBackground(Color.BLUE);
					if (VisualScramble.yellow[1] == 'r') yellow1.setBackground(Color.RED);
					if (VisualScramble.yellow[1] == 'o') yellow1.setBackground(Color.ORANGE);

					if (VisualScramble.yellow[4] == 'w') yellow4.setBackground(Color.WHITE);	
					if (VisualScramble.yellow[4] == 'y') yellow4.setBackground(Color.YELLOW);
					if (VisualScramble.yellow[4] == 'g') yellow4.setBackground(Color.GREEN);
					if (VisualScramble.yellow[4] == 'b') yellow4.setBackground(Color.BLUE);
					if (VisualScramble.yellow[4] == 'r') yellow4.setBackground(Color.RED);
					if (VisualScramble.yellow[4] == 'o') yellow4.setBackground(Color.ORANGE);

					if (VisualScramble.yellow[5] == 'w') yellow5.setBackground(Color.WHITE);	
					if (VisualScramble.yellow[5] == 'y') yellow5.setBackground(Color.YELLOW);
					if (VisualScramble.yellow[5] == 'g') yellow5.setBackground(Color.GREEN);
					if (VisualScramble.yellow[5] == 'b') yellow5.setBackground(Color.BLUE);
					if (VisualScramble.yellow[5] == 'r') yellow5.setBackground(Color.RED);
					if (VisualScramble.yellow[5] == 'o') yellow5.setBackground(Color.ORANGE);

					if (VisualScramble.yellow[6] == 'w') yellow6.setBackground(Color.WHITE);	
					if (VisualScramble.yellow[6] == 'y') yellow6.setBackground(Color.YELLOW);
					if (VisualScramble.yellow[6] == 'g') yellow6.setBackground(Color.GREEN);
					if (VisualScramble.yellow[6] == 'b') yellow6.setBackground(Color.BLUE);
					if (VisualScramble.yellow[6] == 'r') yellow6.setBackground(Color.RED);
					if (VisualScramble.yellow[6] == 'o') yellow6.setBackground(Color.ORANGE);

					if (VisualScramble.yellow[7] == 'w') yellow7.setBackground(Color.WHITE);	
					if (VisualScramble.yellow[7] == 'y') yellow7.setBackground(Color.YELLOW);
					if (VisualScramble.yellow[7] == 'g') yellow7.setBackground(Color.GREEN);
					if (VisualScramble.yellow[7] == 'b') yellow7.setBackground(Color.BLUE);
					if (VisualScramble.yellow[7] == 'r') yellow7.setBackground(Color.RED);
					if (VisualScramble.yellow[7] == 'o') yellow7.setBackground(Color.ORANGE);

					if (VisualScramble.yellow[0] == 'w') yellow0.setBackground(Color.WHITE);	
					if (VisualScramble.yellow[0] == 'y') yellow0.setBackground(Color.YELLOW);
					if (VisualScramble.yellow[0] == 'g') yellow0.setBackground(Color.GREEN);
					if (VisualScramble.yellow[0] == 'b') yellow0.setBackground(Color.BLUE);
					if (VisualScramble.yellow[0] == 'r') yellow0.setBackground(Color.RED);
					if (VisualScramble.yellow[0] == 'o') yellow0.setBackground(Color.ORANGE);

			
				}
			}
			
		});
		
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				timerArea.setText(null);
				Timer obj = new Timer();
				obj.start();
				
				
			}
		});
		
		stopBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display time
				Timer obj = new Timer();
				obj.stop();
				//timerArea.setText(Timer.time);
				timerArea.setText(Timer.time);
				
				
				//add time to list of previous times
				String t = null;
				for(int i = 0; i<Timer.timeList.size(); i++) {
					t = Timer.timeList.get(i);
				}
				//adds previous times to the prevtArea
				prevtArea.append(Timer.timeDisplay);
				prevtArea.append("\n");
				
				
				//display statistics
				statArea.setText("Best Time: " + Timer.bestTime+"\n");
				
				statArea.append("Ao5: " + Timer.avgTime+"\n");
				statArea.append("Fastest Ao5: " + Timer.bestAvg + "\n" );
				
				
				
				
			}
		});
		
		exportBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				writeToFile g = new writeToFile();
				g.openFile();
				g.addTimes();
				g.closeFile();
				
				//JOptionPane.showConfirmDialog(this, "Times Exported Succesfully to 'Times.txt'");
				
				
			}
		});
		
		exportBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
                //JOptionPane.showMessageDialog(MainFrame.getComponent(0), "Hello World");

            }
        });
		
			
		
		
		JButton openFileBtn = new JButton("Open File");
		openFileBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				writeToFile g = new writeToFile();
				g.selectFile();
				g.readFile();
				JOptionPane.showMessageDialog(openFileBtn, "Times Imported Sucessfully");

				String t = null;
				for(int i = 0; i<writeToFile.MYARRAY.length-1; i++) {
					t = writeToFile.MYARRAY[i];
					prevtArea.append(t);
					prevtArea.append("\n");
				}
				
			}
		});
		openFileBtn.setBounds(64, 654, 111, 31);
		timerPane.add(openFileBtn);
		
		
				
		
		setSize(1200,800);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
