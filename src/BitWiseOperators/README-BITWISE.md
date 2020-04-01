Bitwise And
Bitwise Or
Bitwise Xor
Bitwise Not
Left Shift <<
Right Shift >>
Unsigned Right Shift >>>

Java has a 32 bit integer
Value ranges from -2^32 to 2^32-1
Negative value has leading bit set to one

e.g ~(5) = ??

000..00101
111..11010

for 1
000..00001
~1
111..11110
2^x-1-1 = -2

Brian kerningam
n&(n-1) repeatedly removes the first most set bit

First set bit
n&!(n-1)
n=    000.1010
n-1=  000.1001
~(n-1)111.0110

&     000.0010   
(n&!(n-1))





