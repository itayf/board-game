package com.itay.game;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class Tile  {
	private Button button;
	private boolean bomb;
	private boolean pressed = false;
	private int number = 0;

	public boolean isPressed() {
		return pressed;
	}

	public void setPressed(boolean pressed) {
		this.pressed = pressed;
	}

	public boolean isBomb() {
		return bomb;
	}

	public void setBomb(boolean bomb) {
		this.bomb = bomb;
	}

	public Tile(Composite parent) {
		button = new Button(parent, SWT.PUSH);
		button.setLayoutData(new GridData());
		button.setText(String.valueOf(number));
		button.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				handlePressed();
				return;
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	private void handlePressed() {
		button.setText(String.valueOf(Game.getInstance().getTurn(true)));
		
	}

}
