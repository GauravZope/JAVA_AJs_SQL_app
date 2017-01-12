package com.utility;

import java.math.BigDecimal;
import java.util.Collection;

import constants.Constants;

public class devUtility{
	
	public static boolean validateCollectionForNullSize(Collection set){

		if(set != null && set.size() > 0){
			return true;
		}

		return false;
	}
	public static boolean validateStringForNullSize(String string) {
		if (string != null && !"".equals(string.trim())) {
			return true;
		}
		return false;

	}

	public static boolean validateStringForNullSizeForDetails(String string) {
		if (string != null && !"".equals(string) && !" ".equals(string)) {
			return true;
		}
		return false;

	}

	/**
	 *
	 * @param value
	 * @return
	 */
	public static boolean validateForZero(double value){
		if (value != Constants.CHECK_FOR_ZERO) {
			return true;
		}
		return false;
	}
	/**
	 * @ Kathiravan J   07 April 09
	 * @param value
	 * @return
	 */
	public static boolean validateForZeroForBigdecimal(BigDecimal value){
		if ((validateForNullObject(value)) &&
				(value.doubleValue() != Constants.CHECK_FOR_FLOAT_ZERO)){
			return true;
		}
		return false;
	}

	/**
	 *
	 * @param value
	 * @return
	 */
	public static boolean validateForZero(int value){
		if (value != Constants.CHECK_FOR_ZERO) {
			return true;
		}
		return false;
	}

	public static boolean validateForZero(long value){
		if (value != Constants.CHECK_FOR_ZERO) {
			return true;
		}
		return false;
	}
	
	public static boolean validateForNullObject(Object obj) {

		if (obj != null) {
			return true;
		}
		return false;
	}
}