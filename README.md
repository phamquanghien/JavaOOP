1. Hiển thị tất cả các nhánh: git branch -a
2. Tạo nhánh mới: git checkout -b BRANCH_NAME, git push -u origin BRANCH_NAME
3. Cập nhật thay đổi mã nguồn lên github: git add ., git commit -m COMMIT_NOTE, git push
4. Đồng bộ mã nguồn từ nhánh "Test" vào nhánh "main": cần chuyển sang nhánh "main" và chạy lệnh "git merge Test"
5. Hiển thị danh sách các commit: git log --oneline
6. Khôi phục mã nguồn tại thời điểm bất kỳ (không giữ lại các thay đổi): git reset --hard COMMIT_ID
7. Khôi phục mã nguồn tại thời điểm bất kỳ (giữ lại các thay đổi): git reset --soft HEAD~SoLuongCommit
8. Xoá nhánh trên local: git branch -d BRANCH_NAME
9. Xoá nhánh trên remote (github): git push origin --delete BRANCH_NAME