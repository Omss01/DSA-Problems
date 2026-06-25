package com.array;

public class UnionOfTwoArray {

	public void sortedArray(int[] a1, int[] a2) {
		int s1 = a1.length;
		int s2 = a2.length;

		int i = 0;
		int j = 0;
		int[] unionArr = new int[s1 + s2];
		int k = 0;
		while (i < s1 && j < s2) {
			if (a1[i] < a2[j]) {
				if (k == 0 || unionArr[k - 1] != a1[i]) {
                    unionArr[k++] = a1[i];
                }
				i++;
				
			}

			else if (a1[i] > a2[j]) {
				if (k == 0 || unionArr[k - 1] != a2[j]) {
                    unionArr[k++] = a2[j];
                }
				j++;
				
			} else {
				if (k == 0 || unionArr[k - 1] != a1[i]) {
                    unionArr[k++] = a1[i];
                }
				i++;
				j++;
			}
		}
		while (i < s1) {
			 if (k == 0 || unionArr[k - 1] != a1[i]) {
	                unionArr[k++] = a1[i];
	            }
			i++;
			
		}

		while (j < s2) {
			 if (k == 0 || unionArr[k - 1] != a1[j]) {
	                unionArr[k++] = a1[i];
	            }
			j++;
		}
		System.out.println("Union Array: ");
		for(int x=0;x<k;x++) {
			System.out.print(unionArr[x]+" ");
		}

	}

	public static void main(String[] args) {
		UnionOfTwoArray obj = new UnionOfTwoArray();
		obj.sortedArray(new int[] { 1, 2, 2, 3, 4, 5 }, new int[] { 1, 1, 2, 2, 3, 4, 5 });
	}
}
