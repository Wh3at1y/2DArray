package array.model;

public class BackPack
	{
		private String[][] contents;
		private int x;
		private int y;
		
		public BackPack()
		{
			contents = new String[5][5];
		}
		
		public void addStuff(int x, int y, String content)
		{
			this.x = x;	this.y = y;
			contents[x][y] = content;
			System.out.println("ROW : " + x + "COL : " + y + "\n" + contents[x][y]);
		}

		public String getContents()
			{
				return contents[x][y];
			}
		
		public void removeStuff(int x, int y)
		{
			this.x = x;	this.y = y;
			contents[x][y] = "";
		}
		
		
	}
