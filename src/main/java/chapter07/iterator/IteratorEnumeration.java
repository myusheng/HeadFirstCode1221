/**
 * package chapter07.iterator
 * Adapter mode
 */
package chapter07.iterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author MY
 * Date:2019-12-24
 */
public class IteratorEnumeration implements Enumeration {
	Iterator iterator;
 
	public IteratorEnumeration(Iterator iterator) {
		this.iterator = iterator;
	}
	
	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}
	
	@Override
	public Object nextElement() {
		return iterator.next();
	}
}
