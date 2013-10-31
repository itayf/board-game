package com.itay.game;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

public class Board  {
	private Group group;

	private int size=8;

	public Board(Composite parent) {
		group = new Group(parent, SWT.NONE);
//		group.setLayoutData(new GridLayout(size, true));
		GridData gridData = new GridData(SWT.NONE, SWT.NONE, false, false);
	    gridData.horizontalSpan = 2;
	    group.setLayoutData(gridData);
		group.setLayout(new GridLayout(size, true));
		group.setText("Group");
		for (int i=0; i<size; i++){
			for (int j=0; j<size; j++){
				new Tile(group);
			}
		}
		group.pack();
	}

}
