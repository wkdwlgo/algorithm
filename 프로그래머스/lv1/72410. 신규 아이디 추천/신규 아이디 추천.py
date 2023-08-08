
def solution(new_id):
    answer = ''
    new_id=new_id.lower()
    특수문자="""!"$%&'()*+,/:;<=>?[\]^{|}~@#"""
    for i in 특수문자:
        new_id = new_id.replace(i, '')
    new_id= list(new_id)
    idx=new_id[0]
    for i in range(1,len(new_id)):
        if idx==new_id[i] and idx=='.':
            new_id[i]=''
        else:
            idx=new_id[i]
    new_id=''.join(new_id)
    
    new_id=new_id.strip('.')
    
    if len(new_id)==0:
        new_id='a'
    
    if len(new_id)>15:
        new_id=new_id[:15]
        
        new_id=new_id.rstrip('.')
        
    
    if len(new_id)<3:
        length=3-len(new_id)
        last_char=new_id[-1]
        new_id+=last_char*length

        
        
            
        
    answer=new_id
            
        
    return answer