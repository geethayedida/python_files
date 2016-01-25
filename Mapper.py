'''
In this script, we generate the key,value paid in the form of ((word,document), term frequency) and also normalize term frequency w.r.t. document length
'''
#!/usr/bin/env python

from operator import itemgetter
import sys
from collections import Counter

for line in sys.stdin:
  
    counter = Counter()    
    line = line.strip()
    
    try:
        docid, abstract = line.split('\t')
    except:        
        pass
    try:
        words = abstract.split()
    except:        
        pass        
    
    for word in words:
        counter[word] += 1  #Counts the no. of occurance of a word in a document = tf
        
    for k,v in counter.items():
    
        print '%s\t%s\t%f' % (k, docid, (float(v)/len(words))) # normalize the tf value w.r.t. document length.
        

        

        
