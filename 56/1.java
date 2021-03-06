class Solution{
	public int[][] merge(int[][] intervals){
		if(intervals.length == 0){
			return new int[0][2];
		}

		Arrays.sort(intervals, new Comparator<int[]>(){
			@Override
			public int compare(int[] intervals1, int[] intervals2){
				return intervals1[0] - intervals2[0];
			}
		});

		List<int[]> merge = new ArrayList<int[]>();
		merge.add(0,intervals[0]);
		int left = intervals[0][0];
		int right = intervals[0][1];
		int k = 0;
		for(int i = 1; i < intervals.length; i++){
			if(right >= intervals[i][0]){	
				right = Math.max(intervals[i][1],right);			
				merge.set(k, new int[]{left, right});
			}
			else{
				k = k + 1;
				left = intervals[i][0];
				right = intervals[i][1];
                merge.add(k, new int[]{left, right});
			}
		}
		return merge.toArray(new int[merge.size()][2]);

	}
}