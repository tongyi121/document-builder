package com.craigburke.document.core

/**
 * An individual column for the Table node
 * @author Craig Burke
 */
class Column extends BaseNode implements Stylable, Alignable, BackgroundAssignable {
	List children = []
	Integer width
	Integer colspan = 1
	Integer rowspan = 1
	int currentRow = 0
}
