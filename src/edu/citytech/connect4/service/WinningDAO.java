package edu.citytech.connect4.service;

public class WinningDAO {

	public static WinningCombo[] findAll() {

		WinningCombo[] wcs = new WinningCombo[41];

		wcs[0] = new WinningCombo(0, 1, 2, 3);
		wcs[1] = new WinningCombo(1, 2, 3, 4);
		wcs[2] = new WinningCombo(2, 3, 4, 5);
		wcs[3] = new WinningCombo(3, 4, 5, 6);
		
		wcs[4] = new WinningCombo(7, 8, 9, 10);
		wcs[5] = new WinningCombo(8, 9, 10, 11);
		wcs[6] = new WinningCombo(9, 10, 11, 12);
		wcs[7] = new WinningCombo(10, 11, 12, 13);
		
		wcs[8] = new WinningCombo(14, 15, 16, 17);
		wcs[9] = new WinningCombo(15, 16, 17, 18);
		wcs[10] = new WinningCombo(16, 17, 18, 19);
		wcs[11] = new WinningCombo(17, 18, 19, 20);
		
		wcs[12] = new WinningCombo(21, 22, 23, 24);
		wcs[13] = new WinningCombo(22, 23, 24, 25);
		wcs[14] = new WinningCombo(23, 24, 25, 26);
		wcs[15] = new WinningCombo(24, 25, 26, 27);
		
		wcs[16] = new WinningCombo(28, 29, 30, 31);
		wcs[17] = new WinningCombo(29, 30, 31, 32);		
		wcs[18] = new WinningCombo(30, 31, 32, 33);
		wcs[19] = new WinningCombo(31, 32, 33, 34);
		
		wcs[20] = new WinningCombo(35, 36, 37, 38);
		wcs[21] = new WinningCombo(36, 37, 38, 39);
		wcs[22] = new WinningCombo(37, 38, 39, 40);
		wcs[22] = new WinningCombo(38, 39, 40, 41);
		
		wcs[24] = new WinningCombo(0, 7, 14, 21);
		wcs[25] = new WinningCombo(7, 14, 21, 28);
		wcs[26] = new WinningCombo(14, 21, 28, 35);
		
		wcs[27] = new WinningCombo(1, 8, 15, 22);
		wcs[28] = new WinningCombo(8, 12, 22, 29);
		wcs[29] = new WinningCombo(15, 22, 29, 36);
		
		wcs[30] = new WinningCombo(2, 9, 16, 23);
		wcs[31] = new WinningCombo(9, 16, 23, 30);
		wcs[32] = new WinningCombo(16, 23, 30, 37);
		wcs[33] = new WinningCombo(3, 10, 17, 24);
		wcs[34] = new WinningCombo(10, 17, 24, 31);
		wcs[35] = new WinningCombo(17, 24, 31, 38);
		
		wcs[36] = new WinningCombo(4, 11, 18, 25);
		wcs[37] = new WinningCombo(11, 18, 25, 32);
		wcs[38] = new WinningCombo(18, 25, 32, 39);
		
		wcs[39] = new WinningCombo(5, 12, 19, 26);
		wcs[40] = new WinningCombo(12, 19, 26, 33);
		wcs[41] = new WinningCombo(19, 26, 33, 40);
		
		wcs[42] = new WinningCombo(6, 13, 20, 27);
		wcs[43] = new WinningCombo(13, 20, 27, 34);
		wcs[44] = new WinningCombo(20, 27, 34, 41);
		
		wcs[45] = new WinningCombo(14, 22, 30, 38);
		
		wcs[46] = new WinningCombo(7, 15, 23, 31);
		wcs[47] = new WinningCombo(15, 23, 31, 39);
		
		wcs[48] = new WinningCombo(0, 8, 16, 24);
		wcs[49] = new WinningCombo(8, 16, 24, 32);
		wcs[50] = new WinningCombo(16, 24, 32, 40);
		
		wcs[51] = new WinningCombo(1, 9, 17, 25);
		wcs[52] = new WinningCombo(9, 17, 25, 33);
		wcs[53] = new WinningCombo(17, 25, 33, 41);
		
		wcs[54] = new WinningCombo(2, 10, 18, 26);
		wcs[55] = new WinningCombo(10, 18, 26, 34);
		
		wcs[56] = new WinningCombo(3, 11, 19, 27);
		wcs[57] = new WinningCombo(20, 26, 32, 38);
		
		wcs[58] = new WinningCombo(13, 19, 25, 31);		
		wcs[59] = new WinningCombo(19, 25, 31, 37);
		
		wcs[60] = new WinningCombo(6, 12, 18, 24);
		wcs[61] = new WinningCombo(12, 18, 24, 30);

		wcs[62] = new WinningCombo(18, 24, 30, 36);
		wcs[63] = new WinningCombo(2, 11, 17, 23);
		wcs[64] = new WinningCombo(11, 17, 23, 29);
		wcs[65] = new WinningCombo(17, 23, 29, 35);
		wcs[66] = new WinningCombo(4, 10, 16, 22);
		wcs[67] = new WinningCombo(10, 16, 22, 28);
		wcs[68] = new WinningCombo(3, 9, 15, 21);

		return wcs;
	}

}
