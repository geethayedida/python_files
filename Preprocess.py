'''
In this script, we convert the abstracts into lowercase, remove punctuation and numbers, remove stopwords and perform word stemming.
For word stemming, we use the NTLK python package.
'''

import re
from nltk.stem.porter import PorterStemmer
stemmer = PorterStemmer()

stopword_set = ['a','able','about','across','after','all','almost','also','am','among','an','and','any','are','as','at','be','because','been','but','by','can','cannot','could','dear','did','do','does','either','else','ever','every','for','from','get','got','had','has','have','he','her','hers','him','his','how','however','i','if','in','into','is','it','its','just','least','let','like','likely','may','me','might','most','must','my','neither','no','nor','not','of','off','often','on','only','or','other','our','own','rather','said','say','says','she','should','since','so','some','than','that','the','their','them','then','there','these','they','this','tis','to','too','twas','us','wants','was','we','were','what','when','where','which','while','who','whom','why','will','with','would','yet','you','your']

f1 = open("Dataset.txt","r")
f2 = open("Dataset_clean.txt","w")


def remove_stopwords(data):
    words = data.split()
    clean_set = [w for w in words if w not in stopword_set]
    clean_text = ' '.join(clean_set)
    return clean_text

def stemming(data):
    words = data.split()
    stemmed_set =  ' '.join([stemmer.stem(w) for w in words])
    return stemmed_set

input_data = f1.readlines()
f1.close()

for line in input_data:

    line = line.strip()   
    
    #split the input line and use only abstract
    
    url, abstract = line.split(',',1)    
    
    #convert the abstract to lower case
    
    to_lower = abstract.lower()    
        
    #remove punctuations
    
    no_punctuation = re.sub(r'[^a-z\s]','',to_lower)
         
    #remove stopwords
    
    no_stopword = remove_stopwords(no_punctuation)   
    
    #perform word stemming
    
    stemmed_text = stemming(no_stopword)
  
    f2.write(url)
    f2.write('\t')
    f2.write(stemmed_text)
    f2.write('\n')      
    

f2.close()
