package array.controller;

import array.model.BackPack;
import array.view.ArrayFrame;

public class ArrayController
	{
		private ArrayFrame baseFrame;
		private BackPack backPack;
		
		public ArrayController()
		{
			baseFrame = new ArrayFrame(this);
			backPack = new BackPack();
		}
		
		public void start()
		{
		
		}
		
		public void getPos(int x, int y, String content)
		{
			backPack.addStuff(x, y, content);
		}

	}
