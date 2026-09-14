class Solution:
    def countPairs(self, arr: List[int]) -> int:
        bs=[]
        for i in range(0,22):
            bs.append(2**i)
        arr.sort()
        d={}
        ans=0
        for i in arr:
            if i in bs and 0 in d:
                ans+=d[0]
                
            temp=0
            for j in bs:
                if j>i:
                    temp=j
                    break
            tof=temp-i
            if tof in d:
                ans+=d[tof]
                ans=ans%(10**9+7)
            d[i]=d.get(i,0)+1
        return ans%(10**9+7)


        