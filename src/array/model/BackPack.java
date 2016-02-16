package array.model;

public class BackPack
	{
		private String[][] contents;
		
		public BackPack()
		{
			contents = new String[5][5];
		}
		
		public void addStuff(int x, int y, String content)
		{
			contents[x][y] = content;
			System.out.println("ROW : " + x + "COL : " + y + "\n" + contents[x][y]);
		}
		
	}
