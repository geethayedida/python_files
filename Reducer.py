'''
In this script, we calculate the idf and tfidf values for every word
'''
#!/usr/bin/env python

from operator import itemgetter
import sys
import math

N=0
doc_freq = dict()
lines = []

for line in sys.stdin:
    lines.append(line)
    
    line = line.strip()
    try:
        word, docid, count = line.split('\t')
    except:
        pass

    #For every word, count the number of documents in which it appears. This is required for idf calculation
    if word not in doc_freq.keys():           
            doc_freq[word] = 1
            last_docid = docid
    else:
        if last_docid is not docid:
            doc_freq[word] += 1

    N= N+1


for line in lines:    
    line = line.strip()
    try:
        word, docid ,count = line.split('\t')
    except:
        pass

    count = float(count)   

    #Calculate the idf and tf-idf value for every word
    idf = math.log10(N/doc_freq[word])    
    tfidf = idf * count
    print '%s\t%s\t%s' % (word, docid, tfidf)   


