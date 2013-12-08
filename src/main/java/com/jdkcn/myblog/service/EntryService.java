/**
 * Copyright (c) 2005-2012, Rory Ye
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright notice,
 *       this list of conditions and the following disclaimer in the documentation
 *       and/or other materials provided with the distribution.
 *     * Neither the name of the Jdkcn.com nor the names of its contributors may
 *       be used to endorse or promote products derived from this software without
 *       specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.jdkcn.myblog.service;

import com.jdkcn.myblog.domain.Entry;
import com.jdkcn.myblog.hibernate.Condition;
import com.jdkcn.myblog.util.PaginationSupport;
import com.jdkcn.myblog.util.Range;
import com.jdkcn.myblog.util.Sorter;

/**
 * @author <a href="mailto:rory.cn@gmail.com">Rory</a>
 * @version $Id: EntryService.java 417 2011-05-08 09:03:26Z rory.cn $
 */
public interface EntryService {

	/**
	 * Save or update the entry.
	 * 
	 * @param entry
	 *            the entry to save or update
	 * @return the saved entry
	 */
	Entry saveOrUpdate(Entry entry);

	/**
	 * Get the entry by id.
	 * 
	 * @param id
	 *            the entry's id
	 * @return the entry with this id or null if not exist
	 */
	Entry get(String id);

	/**
	 * Get entry by name, the name in one blog must unique.
	 * 
	 * @param blogId
	 *            the blog's id
	 * @param name
	 *            the entry's name
	 * @return the entry with name in this blog or null if not exist
	 */
	Entry getByName(String blogId, String name);

	/**
	 * Search the entry by page.
	 * 
	 * @param condition
	 *            the search condition
	 * @param range
	 *            the range, contains start and size
	 * @param sorter
	 *            the sorter
	 * @return the pagination entry list
	 */
	PaginationSupport<Entry> search(Condition condition, Range range, Sorter sorter);

}
