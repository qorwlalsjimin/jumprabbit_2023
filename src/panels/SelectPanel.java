package panels;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import object.Rabbitimg;

public class SelectPanel extends JPanel {

	
	// ������ ĳ���� �̹��� ������
	private ImageIcon ch01 = new ImageIcon("img/RabbitImg/rabbit1/rightRabbit.gif");
	private ImageIcon ch02 = new ImageIcon("img/RabbitImg/rabbit1/rightRabbit.gif");
	private ImageIcon ch03 = new ImageIcon("img/RabbitImg/rabbit1/rightRabbit.gif");
	private ImageIcon ch04 = new ImageIcon("img/RabbitImg/rabbit1/rightRabbit.gif");

	// ���õ� ĳ���� �̹��� ������
	private ImageIcon ch011 = new ImageIcon("img/RabbitImg/rabbit1/rightRabbit.gif");
	private ImageIcon ch022 = new ImageIcon("img/RabbitImg/rabbit1/rightRabbit.gif");
	private ImageIcon ch033 = new ImageIcon("img/RabbitImg/rabbit1/rightRabbit.gif");
	private ImageIcon ch044 = new ImageIcon("img/RabbitImg/rabbit1/rightRabbit.gif");

	// ���� ��ư �̹���������
	private ImageIcon start = new ImageIcon("img/select/selectBtn.png");
	
	// �̹����� ������ ��ư
	private JButton ch1;
	private JButton ch2;
	private JButton ch3;
	private JButton ch4;
	
	private int x = 250;
	private int y = 250;
	
	// ���� ��ư
	private JButton StartBtn;
	
	// ���ӿ��� ����� ��Ű �̹������� ���� ������Ʈ
	private Rabbitimg ci;

	// ��Ű �̹����� ���ο��� gamePanel�� ������ ���� ����
	public Rabbitimg getCi() {
		return ci;
	}

	public SelectPanel(Object o) {

		// ���� ��ư
		StartBtn = new JButton(start);
		StartBtn.setName("StartBtn");
		StartBtn.addMouseListener((MouseListener) o);
		StartBtn.setBounds(470, 550, 291, 81);
		add(StartBtn);
		StartBtn.setBorderPainted(false);
		StartBtn.setContentAreaFilled(false);
		StartBtn.setFocusPainted(false);

		// ĳ���� ch1
		ch1 = new JButton(ch01);
		ch1.setName("ch1");
		ch1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ch1.setIcon(ch011);
				ch2.setIcon(ch02);
				ch3.setIcon(ch03);
				ch4.setIcon(ch04);
				ci = new Rabbitimg(new ImageIcon("img/RabbitImg/rabbit1/rightRabbit.gif"),
						new ImageIcon("img/RabbitImg/rabbit1/rightRabbit.gif"),
						new ImageIcon("img/RabbitImg/rabbit1/rightRabbit.gif"),
						new ImageIcon("img/RabbitImg/rabbit1/rightRabbit.gif"),
						new ImageIcon("img/RabbitImg/rabbit1/damageRabbit.gif"),
						new ImageIcon("img/RabbitImg/rabbit1/damageRabbit.gif"));
			}
		});
		ch1.setBounds(x, y, 150, 200);
		add(ch1);
		ch1.setBorderPainted(false);
		ch1.setContentAreaFilled(false);
		ch1.setFocusPainted(false);

		// ĳ���� ch2
		ch2 = new JButton(ch02);
		ch2.setName("ch2");
		ch2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ch1.setIcon(ch01);
				ch2.setIcon(ch022);
				ch3.setIcon(ch03);
				ch4.setIcon(ch04);
				ci = new Rabbitimg(new ImageIcon("img/RabbitImg/rabbit2/normal.gif"),
						new ImageIcon("img/RabbitImg/rabbit2/jump.gif"),
						new ImageIcon("img/RabbitImg/rabbit2/doublejump.gif"),
						new ImageIcon("img/RabbitImg/rabbit2/fall.png"),
						new ImageIcon("img/RabbitImg/rabbit2/slide.gif"),
						new ImageIcon("img/RabbitImg/rabbit2/hit.gif"));
			}
		});
		ch2.setBounds(x+200, y, 150, 200);
		add(ch2);
		ch2.setBorderPainted(false);
		ch2.setContentAreaFilled(false);
		ch2.setFocusPainted(false);

		// ĳ���� ch3
		ch3 = new JButton(ch03);
		ch3.setName("ch3");
		ch3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ch1.setIcon(ch01);
				ch2.setIcon(ch02);
				ch3.setIcon(ch033);
				ch4.setIcon(ch04);
				ci = new Rabbitimg(new ImageIcon("img/RabbitImg/rabbit3/cookie.gif"),
						new ImageIcon("img/cookieimRabbitImgg/rabbit3/jump.png"),
						new ImageIcon("img/RabbitImg/rabbit3/doublejump.gif"),
						new ImageIcon("img/RabbitImg/rabbit3/fall.png"),
						new ImageIcon("img/RabbitImg/rabbit3/slide.gif"),
						new ImageIcon("img/RabbitImg/rabbit3/hit.png"));
			}
		});
		ch3.setBounds(x+400, y, 150, 200);
		add(ch3);
		ch3.setBorderPainted(false);
		ch3.setContentAreaFilled(false);
		ch3.setFocusPainted(false);

		// ĳ���� ch4
		ch4 = new JButton(ch04);
		ch4.setName("ch4");
		ch4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ch1.setIcon(ch01);
				ch2.setIcon(ch02);
				ch3.setIcon(ch03);
				ch4.setIcon(ch044);
				ci = new Rabbitimg(new ImageIcon("img/RabbitImg/rabbit4/kch.gif"),
						new ImageIcon("img/RabbitImg/rabbit4/kjump.gif"),
						new ImageIcon("img/RabbitImg/rabbit4/kjump.gif"),
						new ImageIcon("img/RabbitImg/rabbit4/kjump.gif"),
						new ImageIcon("img/RabbitImg/rabbit4/kslide.gif"),
						new ImageIcon("img/RabbitImg/rabbit4/kch.gif"));
			}
		});
		ch4.setBounds(x+600, y, 150, 200);
		add(ch4);
		ch4.setBorderPainted(false);
		ch4.setContentAreaFilled(false);
		ch4.setFocusPainted(false);
		
		JLabel selectBg = new JLabel("");
		selectBg.setForeground(Color.ORANGE);
		selectBg.setHorizontalAlignment(SwingConstants.CENTER);
		selectBg.setIcon(new ImageIcon("img/Objectimg/map1img/selectBack.png"));
		selectBg.setBounds(0, 0, 1200, 800);
		add(selectBg);
	}
}
