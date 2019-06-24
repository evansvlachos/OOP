dim a,b,c,d,x1,x2 as double
a=double.parse(textbox1.text)
b=double.parse(textbox2.text)
c=double.parse(textbox3.text)
if a=0 THEN
if b=0 then 
if c=0 then
textbox4.text="AO"
else
textbox4.text="adynath"
end
else
x1=-b/a
textbox4.text=x1 to string()
else
d=l^2-4*a*c
if d<0 then
textbox4.text="adbb"
else if d=0 then 
x2=-b/2*a
textbox4.text=x2 to string()
else
x3=-b-sqrt(d)/2*a
textbox4.text=x3.to string()
textbox5.text=x1.to string()
end if
end if