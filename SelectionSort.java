public class SelectionSort implements SortingAlgorithm
{
	public void sort(int [] a)
	{
		int small;
		int temp;

		for (int i = 0; i < a.length-1; i++)
		{
			small = i;

			for (int j = i+1; j < a.length; j++)
			{
				if (a[j] < a[small])
				{
					small = j;
				}
			}

			temp = a[small];
			a[small] = a[i];
			a[i] = temp;
		}
	}

}