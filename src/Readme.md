### Analysis of recursion

    void fun(int n){
     for(int i=0;i<n;i++){
      // do something
     }
     fun(n/2);
     fun(n/2);
    }

    T(n) = 2T(n/2)+ cn;
    Evaluate the Time complexity based on recursion tree method
    make the non-recursive part as the root and the recursive part as the children
    
             cn
            /  \ 
         T(n/2) T(n/2)
         
             ||
             
                cn                  --work done = cn
            /       \
          cn/2       cn/2          -- work done =  cn
          /  \      /    \
      T(n/4) T(n/4)T(n/4) T(n/4)    -- work done = cn
      
      Work done at each level = cn
      Number of levels = height of the tree= logn
      Complexity = T(nlogn) 