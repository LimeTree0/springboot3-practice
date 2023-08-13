
// 글을 등록하는 기능
var main = {
    init : function() {
        var _this = this;
        // #btn-save란 id를 가진 HTML 엘리먼트에 click 발생하면 저장 실행
        $('#btn-save').on('click', function() {
            _this.save();
        });

        // #btn-update란 id를 가진 HTML 엘리먼트에 click 발생하면 수정 실행
        $('#btn-update').on('click', function() {
            _this.update();
        });

        // #btn-update란 id를 가진 HTML 엘리먼트에 click 발생하면 삭제 실행
        $('#btn-delete').on('click', function() {
            _this.delete();
        });
    },
    save : function () {
        var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };

        $.ajax({
            type: 'POST',
            url: '/api/v1/posts',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function () {
            alert('글이 등록되었습니다.');
            window.location.href = '/'; //글 등록이 성공하면 '/'로 이동
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },
    update : function () {
        var data = {
            title: $('#title').val(),
            content: $('#content').val()
        };

        var id = $('#id').val();

        $.ajax({
            type: 'PUT',
            url: '/api/v1/posts/' + id,
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function () {
            alert('글이 수정되었습니다');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },

    delete : function () {
        var id = $('#id').val();

        $.ajax({
            type: 'DELETE',
            url: '/api/v1/posts/' + id,
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
        }).done(function () {
            alert('글이 삭제되었습니다');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }
};

// 이거 해줘야 작동한다. 위는 선언만 한 것이다.
main.init();