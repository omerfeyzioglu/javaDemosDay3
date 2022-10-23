--Select
--ANSII
Select ContactName Adi,CompanyName Sirketadi,City Sehir from Customers --aliase

Select * from Customers where City = 'Berlin'


--case insensitive 
sElEct * from Products where CategoryID=1 or CategoryID=3
--<>10 different than 10
sElEct * from Products where CategoryID=1 and UnitPrice>=10

select * from Products where CategoryID=1 order by UnitPrice desc --ascending asc --descending

Select count(*)Adet from Products where CategoryID=2	--there are 12 products that's id is 2	

select CategoryID,count(*) adet from Products where UnitPrice>20 
group by CategoryID having count(*)<10
--'where' works before than other commands

select Products.CategoryID pCategoryID,Categories.CategoryID cCategoryID,Products.ProductID,Products.ProductName,Products.UnitPrice,categories.CategoryName from Products inner join Categories on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>14 order by UnitPrice asc

--DTO data transformation object 

Select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o on o.OrderID= od.OrderID

select * from Customers c left join Orders o
on c.CustomerID=o.CustomerID where o.CustomerID is null -- null is used for primary key.


