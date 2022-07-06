<div>
    <div class="form-group my-2">
        <label>title</label>
        <input type="text" class="form-control" wire:model="title">
        @error('title')
        <span class="text-danger">{{$message}}</span>
        @enderror
    </div>
    <div class="form-group my-2">
        <label>Body</label>
        <textarea class="form-control" wire:model="body"></textarea>
        @error('body')
        <span class="text-danger">{{$message}}</span>
        @enderror
    </div>
</div>