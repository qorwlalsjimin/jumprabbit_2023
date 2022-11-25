package object;

import java.awt.Image;

import javax.swing.ImageIcon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rabbitimg {
	private ImageIcon cookieIc=new ImageIcon("img/RabbitImg/cookie1/rightRabbit.gif"); // �⺻���
	private ImageIcon jumpIc=new ImageIcon("img/RabbitImg/cookie1/rightRabbit.gif");; // �������
	private ImageIcon doubleJumpIc=new ImageIcon("img/RabbitImg/cookie1/rightRabbit.gif");; // �����������
	private ImageIcon fallIc=new ImageIcon("img/RabbitImg/cookie1/rightRabbit.gif");; // ���ϸ��(���� ���� ��)
	private ImageIcon slideIc= new ImageIcon("img/RabbitImg/cookie1/damageRabbit.gif"); // �����̵� ���
	private ImageIcon hitIc= new ImageIcon("img/RabbitImg/cookie1/damageRabbit.gif"); // �ε����� ���
}
