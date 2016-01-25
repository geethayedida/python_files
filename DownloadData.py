#import io
import urllib2, json
from urllib2 import urlopen
from time import sleep
from json import loads

j = 1

f1 = open("data.txt","wb")
    
for i in range (0, 6000):
    try:    
        link = 'http://api.nytimes.com/svc/news/v3/content/all/all/world;technology;autos/.json?limit=20&offset='+str(j)+'&api-key=f160a4ebc78088d9629755af29ac7645%3A12%3A69897976'
    
        results = loads(urlopen(link).read())        
        print j
        sleep(3)
    except:
        pass
    
    for k in results['results']: 
        f1.write(k['url'].encode('ascii','replace'))
        f1.write("\t")
        f1.write(k['abstract'].encode('ascii','replace'))
        f1.write("\n")                
   
    j = j+20
    
f1.close()




