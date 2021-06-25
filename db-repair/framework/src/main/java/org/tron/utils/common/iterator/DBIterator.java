package org.tron.utils.common.iterator;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map.Entry;

public interface DBIterator extends Iterator<Entry<byte[], byte[]>>, Closeable {

}