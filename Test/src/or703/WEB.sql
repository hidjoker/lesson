
-- + ����Ŭ DB
--  - Oracle DB Express Edition ���� DB�� �ϳ��� �ִ�
--  - (SID : xe, xe�� DB�̸�)
--  - SID : orcl, Standard Edition�� DB�̸�
--  - ���� : 11g Release 2
--
-- + ���̺�, Table
--  - �����ͺ��̽� ������ ���� �����͸� ����(����)�ϴ� ����
--  - ǥ ����
--  - ��(row), ��(column)���� �̷���� ����
--  - ���̺��� �����ڸ� ����
--  - ���̺��� �����ڸ� ������ �� �ִ�
--  - (��, ������ �ο������� ��������)
--  
-- + SQL, Structed Query Lanquage
--  - ������ ���� ���
--  - �����ͺ��̽��� ����, �����ϴ� ���
--  - CRUD �۾��� ������
--  - Create, Read, Update, Delete
--  - Insert, Select, Update, Delete
--  - ��ũ��Ʈ ���(�����鼭 �ٷ� ����)





-- + ����Ŭ ��
--  1. SQL*Plus
-- 	- Orcale DBMS�� �����ϴ� �⺻ Tool
-- 	- �������ܼ�(cmdâ)���� sqlplus��� �Է�(sqlplus /nolog)
--	- ���۸޴����� 'Run SQL Command Line'���� ���� 
--
--  2. SQL*Developer
--	- Oracle���� �����ϴ� �߰����� Tool


SELECT*FROM emp; --��� ���̺�
SELECT*FROM dept; --�μ� ���̺�
SELECT*FROM bonus; --���ʽ� ���̺�
SELECT*FROM salgrade; --�޿����̺� ���̺�

-- + SQL �뵵�� ���� �з�
--  1. DML, Data Manipulation Language
--     ������ ���۾�
--     ���̺��� �����͸� ����(��ȸ,����,����,����)�ϴ� ��ɾ�
--     ������ ó�� SQL
--     SELECT, INSERT, UPDATE, DELETE
--      (Read,   Create, Update, Delete)
--     *DQL, Data Query Language : SELECT ����, ����


SELECT*FROM tabs; --��ü ���̺� ��ȸ
SELECT table_name FROM tabs; --��ü ���̺�� ��ȸ

SELECT*FROM EMP;

desc emp; -- emp ���̺� ��Ű�� ����

-- INSERT ���� �׽�Ʈ
--�����͸� ���̺� ������ �� ���
-- ctrl + / : ���� �ּ�

desc dept;
INSERT INTO dept VALUES (90,'','');
INSERT INTO dept 
VALUES (91,null,null);
SELECT*FROM dept;

-- UPDATE TEST
UPDATE dept
SET loc = 'SEOUL';

-- DELETE TEST
DELETE dept
WHERE deptno = 40; -- �μ���ȣ�� 40�� �� ����
DELETE emp; -- ��ü����

--commit; --Ŀ��, ����� ������ �����ݿ��ϱ�(�ǵ��� �� ����)
--rollback; --�ѹ�, ����� ������ �ݿ����� �ʱ�(�ǵ�����)



-- DDL �⺻ �׽�Ʈ
--  2. DDL, Data Definition Language
--	������ ���Ǿ�
--	������ ���̽��� ����(��Ű��)�� ����, �����ϴ� SQL
--	CREATE, ALTER, DROP
--
--	��Ű���� ��ȸ�� ������ �����ͻ����� ��ȸ�Ѵ�
--	** �����ͻ���, Data Dictionary
--			�����ͺ��̽��� ������ ����ص� Ư���� ���̺�
--			��Ÿ������(metadata)
--  3. DCL, Data Control Language
--     ������ �����
--	������ ���Ἲ, ����, �����۾�, �������� ���� �����ϴ� SQL
--	(Ʈ����� SQL ����)
--     	COMMIT, ROLLBACK : Ʈ����� ����
--	*TCL, Transaction Control Language
--	Ʈ����� �����
--	(COMMIT, ROLLBACK�� ��Ī�ϴ� ���)




CREATE TABLE test( -- test ���̺� ����
    test1 NUMBER, -- ���ڵ����� �÷�
    test2 VARCHAR2(10) -- ���ڿ������� �÷�
);
desc test; -- ���̺� ����(�÷�,�ο���,������Ÿ��) Ȯ��

SELECT * FROM tabs; --���̺�Ű�� �� �����ͻ��� tabs
SELECT * FROM tab; --���̺�Ű�� ���� �����ͻ��� tab


DROP TABLE test; -- ���̺� ����

-- recyclebin : ����Ŭ���� �����ϴ� ������
SHOW recyclebin; -- ������ Ȯ��
FLASHBACK TABLE test to BEFORE DROP; --�����뿡�� ����
PURGE recyclebin; -- ������ ����

DROP TABLE test PURGE; -- �����뿡 �����ʰ� ����





--+ SELECT ����
--	- ���̺� ����� �����͸� ��ȸ�ϴ� ��ɾ�
--	- �ݵ�� FROM ���� �;���
--
-- + ���� ����
--	- SELECT * FROM tablename; 
--		���̺� ��ü(����÷�) ��ȸ
--	- SELECT col1, col2, ... FROM tablename;
--		������ �÷��� ��ȸ
--	- SELECT col1 AS alias1, col2, AS alias2, ... FROM tablename;
--		������ �÷��� ��Ī�� �����Ͽ� ��ȸ


-- SELECT ����
SELECT * FROM emp; -- ��ü��ȸ
SELECT empno, ename FROM emp; --empno, ename �÷��� ��ȸ
SELECT
    empno AS ���, 
    ename AS ����̸� 
FROM emp;

-- + FROM ��
--	- ��ȸ�Ǵ� ����� �����ϴ� ��
--	- ���̺�
--	- ��
--	- �ζ��κ�(��������)

-- + WHERE ��
--	- ���� ��
--	- SELECT, UPDATE, DELETE ������ ����
--	- WHERE [������]
--		[������] -> �÷��̸� ������ ���ǰ�

-- + ������
--	- �� ������
--		= ����
--		<> != ^= ���� �ʴ�
--		> ũ��
--		< �۴�
--		>= ũ�ų� ����
--		<= �۰ų� ����
--	- �� ������
--		AND �� ���� ��� ������ �� TRUE
--		OR �� ���� �� �ϳ��� �����ϸ� TRUE
--		NOT ������ ����(�� ����)
--	- ��Ÿ ������
--		BETWEEN a AND b : a�� b������ ������(a,b ����)
--				ex) deptno BETWEEN 10 AND 20
--					(deptno >=10 AND deptno <=20 )
--				<-> NOT BETWEEN a AND b
--				ex) deptno NOT BETWEEN 10 AND 20
--		IN(list) : list�� �� �� ��� �ϳ��� ��ġ�ϸ� ������ ��ȯ
--                   <-> NOT IN(list)
--				ex) deptno IN(10,20)
--
--		LIKE : ������ ������ ���� �������� ��ġ�ϴ� ������
--			<-> NOT LIKE
--			% : ���� ����, ���ڰ� ���� ��쵵 ����
--			_ : �� ����, �ݵ�� �� ���� �־����
--			LIKE 'B%' -> B�� �����ϴ� ��� ������
--			LIKE '%B%' -> B�� �����ϴ� ��� ������
--			LIKE '_B%' -> �ι�° ���ڰ� B�� ��� ������
--			LIKE '%B' -> B�� ������ ��� ������
--
--		IS NULL : null���� �������� ������
--			<-> IS NOT NULL



-- WHERE ��
SELECT empno, ename, deptno 
FROM emp
--WHERE deptno=10; --�μ���ȣ�� 10���� ����
--WHERE deptno>20; --�μ���ȣ�� 20������ ū ����
WHERE deptno<>20; --�μ���ȣ�� 20�� �ƴ� ����

-- �� ������
-- �μ���ȣ�� 30�̰�, job�� 'SALESMAN'�� ��� ��ȸ
SELECT empno, ename, deptno
FROM emp
WHERE deptno = 30
    AND job = 'SALESMAN';

-- �μ���ȣ�� 30�̰� ������ ������ �ƴ� ���
SELECT empno, ename, deptno
FROM emp
WHERE deptno = 30
    AND NOT(job = 'SALESMAN');
    
--  �μ���ȣ�� 30�� �ƴϰ� ������ ������ �ƴ� ���
SELECT empno, ename, deptno
FROM emp
WHERE NOT(deptno = 30
    OR job = 'SALESMAN');    
-- WHERE deptno!=30 AND job!='SALESMAN'    

-- ��Ÿ ������

-- BETWEEN a AND b
SELECT empno, ename FROM emp
WHERE empno BETWEEN 7700 AND 7900;
--WHERE empno >= 7700 AND empno <= 7900;

-- NOT BETWEEN a AND b
SELECT empno, ename FROM emp
WHERE empno NOT BETWEEN 7700 AND 7900;

-- IN(list)
SELECT empno, ename FROM emp
WHERE empno IN (7369, 7521, 7654, 7777, 8888);
--WHERE empno = 7369
--    OR empno = 7521
--    OR empno = 7654
--    OR empno = 7777
--    OR empno = 8888;

SELECT empno, ename FROM emp
WHERE empno NOT IN (7369, 7521, 7654, 7777, 8888);

-- LIKE
SELECT empno, ename FROM emp
--WHERE ename LIKE '%R%'; -- �̸��� R�� �����ϴ� ��� ���
--WHERE ename LIKE '_A%'; -- �̸��� �ι�°�� A�� ���
--WHERE ename LIKE '%RD'; -- �̸��� �������� RD�� ���
WHERE ename NOT LIKE '%R%' ; --�̸��� R�� ���� ���

SELECT empno, ename FROM emp
--WHERE ename LIKE 'KING' ; --�ϸ� �ȵ�(��������)
WHERE ename = 'KING';

-- IS NULL
SELECT empno, ename FROM emp
--WHERE mgr IS NULL;
--WHERE mgr = null; -- null���� ���� �ȵ�
WHERE mgr IS NOT NULL;

-- �μ���ȣ�� 30�̰� ������ ������ ��� ��ȸ
SELECT empno, ename, deptno FROM emp
WHERE deptno = 30 AND 
    job = 'SALESMAN';

-- �μ���ȣ�� 30�̰� ������ ������ �ƴ� ��� ��ȸ
SELECT empno, ename, deptno FROM emp
WHERE deptno =30 AND
    NOT job = 'SALESMAN';

-- �μ���ȣ�� 30�� �ƴϰ� ������ ������ �ƴ� ��� ��ȸ
SELECT empno, ename, deptno FROM emp
WHERE NOT(deptno=30 OR
    job = 'SALESMAN');
    
-- �����ȣ�� 7782���� 7900 ������ ��� ��ȸ
SELECT empno, ename, deptno FROM emp
WHERE empno BETWEEN 7782 AND 7900;

-- ������� 'A'���� 'C'�� �����ϴ� ��� ��ȸ
SELECT empno, ename, deptno FROM emp
WHERE ename LIKE 'A%' OR 
    ename LIKE 'B%'OR 
    ename LIKE 'C%';
--WHERE ename>='A' AND ename<'D'; ASKII�� ����(������)

-- �μ���ȣ�� 10 �Ǵ� 30�� ��� ��ȸ(IN ���)
SELECT empno, ename, deptno FROM emp
WHERE deptno IN(10,30);

-- ORDER BY ��
SELECT * FROM emp
--ORDER BY empno; -- ��� ��������
--ORDER BY ename; -- �̸� ��������
ORDER BY ename DESC; -- �̸� ��������

-- deptno �������� ���� �� �׷� ������ empno�� ����
SELECT * FROM emp
ORDER BY deptno DESC, empno ASC;

-- NULL �����͸� �ڷ� ������
SELECT * FROM emp
ORDER BY comm DESC NULLS LAST;

-- NULL �����͸� ������ ������
SELECT * FROM emp
ORDER BY comm NULLS FIRST;

-- NULLS ������ ������ ���ı��ؿ� ����ȴ�
SELECT * FROM emp
ORDER BY comm ASC NULLS FIRST, ename DESC;


SELECT * FROM emp
WHERE deptno = 10
ORDER BY sal DESC;

