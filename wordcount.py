file=open('D:\\bigdata\\Challenge1\\data.txt','r')
fo = open('D:\\bigdata\\Challenge1\\foo.txt', 'w')
text=file.read()
words=text.split()
counts=dict()

for word in words:
    counts[word]=counts.get(word,0)+1

''''    
wordcount={}
for word in file.read().split():
    if word not in wordcount:
        wordcount[word] = 1
    else:
        wordcount[word] += 1
print (word,wordcount)
''''
fo.write(word,wordcount)
fo.close()
file.close();

