package com.flames.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.flames.model.FlameAttributes;
@Service
public class ServiceCalculation {

	public static int letterEliminationCount(FlameAttributes flame) {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> newlist = new ArrayList<>();
		String mName = flame.getMaleName();
		String fName = flame.getFemaleName();
		
		String[] mame = new String[mName.length()];
		String[] fame = new String[fName.length()];
		int len1 = 0, len2 = 0;
		for (int i = 0; i < fName.length(); i++) {
			if (!((fName.charAt(i) - '0') == -16)) {
				fame[i] = fName.charAt(i) + "";
				list.add(fame[i].toUpperCase());

			} else {
				len1++;
			}
		}

		for (int i = 0; i < mName.length(); i++) {
			if (!((mName.charAt(i) - '0') == -16)) {
				mame[i] = mName.charAt(i) + "";
				newlist.add(mame[i].toUpperCase());

			} else {
				len2++;
			}
		}

		int count = 0;

		for (int i = 0; i < fName.length() - len1; i++) {
			if (newlist.contains(list.get(i))) {
				count++;
			}
		}

		return (fName.length() + mName.length()) - (2 * count) - len1 - len2;

	}
}
