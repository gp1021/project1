package HorL;

import java.util.ArrayList;
import java.util.List;

public class HLuser {
	public static final String[] BUTTONS = {"Higher", "Lower", "Exit"}; 
	private HLWindow _w;
	private HLview _view;
	private Deck _deck;
	int correct;
	int lost;
	Card current;
	
	public HLuser() {
		_w = new HLWindow();
		_view = new HLview();
		_deck = new Deck();
		current = _deck.deal();
		
		correct = 0;
		lost = 0;
		
		while (lost != 3) {
			int x = _w.option(BUTTONS, _view.toString(current, correct, lost));
			int y = choice(x);
		}
		_w.msg1("You lost :(");
		System.exit(0);
		
		
	}
	
	public int choice(int x) {
		if (x == 0) { //higher
			if (_deck.deal().pointValue() >= current.pointValue()) {
				correct++;
				current = _deck.deal();
			} else {
				lost++;
				current = _deck.deal();
			}
		} else if (x == 1) { //lower
			if (_deck.deal().pointValue() <= current.pointValue()) {
				correct++;
				current = _deck.deal();
			} else {
				lost++;
				current = _deck.deal();
			}
		} else if (x == 2) {
			System.exit(0);
		} else {
			
		}
		return 0;
	}
}
