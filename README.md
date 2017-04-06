# learn
some code sample to lean java deeply

#some sites to learn git deeply
http://www.bootcss.com/p/git-guide/
https://git-scm.com/docs

#git learning notes
#git learning notes begin
#1.add -> commit
git add <fileName>
git add *
git commit -m "comments"

#2.push changes
git push origin <branchName>
git remote add origin <server>

#3.branches
git checkout -b <branchName>
git checkout master
git checkout -d <branchName>

#4.update and merge
git pull
git merge <branchName>
#resolve conflicts
git add <fileName>
#diff
git diff <source_branch> <target_branch>

#5.tags
git tag <version> <commitID>
git log

#6.replace local changes
git checkout --<fileName>
git fetch origin
git reset --hard origin/master

#6.交互地添加文件至缓存区：
git add -i
#git learning notes end
