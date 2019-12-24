/**
 * package Chapter07_enumIterAdapter
 * Adapter mode
 */
package Chapter07_enumIterAdapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author MY
 * Date:2019-12-24
 */
public class EnumerationIterator implements Iterator {
	Enumeration enumeration;
 
	public EnumerationIterator(Enumeration enumeration) {
		this.enumeration = enumeration;
	}
    
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}
	
	@Override
	public Object next() {
		return enumeration.nextElement();
	}
 
	public void remove() {
		throw new UnsupportedOperationException();
	}
}

