package baseball;

public class BaseBallTeam {
	private String name;
	private int win;
	private int lose;
	private int draw;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public double getRate() {
		double result = (double)this.win / (this.win + this.lose);
		return result;


	}

	public void report() {
		double result = getRate();
		System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" +result+ "です。");

	}

}
